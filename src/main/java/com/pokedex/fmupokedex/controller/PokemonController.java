package com.pokedex.fmupokedex.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pokedex.fmupokedex.model.Pokemon;
import com.pokedex.fmupokedex.service.IPokemonService;

@CrossOrigin(maxAge = 3600)
@RestController
public class PokemonController {
	@Autowired
	private IPokemonService service;
	
	@CrossOrigin(origins = "http://localhost:3000")
	//recuperar todos
	@GetMapping("/pokemons") 
	public ArrayList<Pokemon> recuperarTodoMundo(){ 
		return service.recuperarTodos(); 
	}
	
	//recuperar pela pagina
	
	//recuperar pelo ID
	@GetMapping("/pokemons/{codigo}")
	public ResponseEntity<Pokemon> recuperarPeloCodigo(@PathVariable Integer codigo){
		Pokemon res = service.recuperarPeloCodigo(codigo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).build();
	}
	
	//recuperar pelo endpoint numero de poke na pag + num pag
	@GetMapping("/pokemons/size={pageSize}/page={pageNo}")
	public List<Pokemon> getPaginatedListPokemon(@PathVariable int pageSize, @PathVariable int pageNo) {
		return service.encontrarPelaPagina(pageNo, pageSize);
	}

	//cadastrar
	@PostMapping("/pokemons")
	public ResponseEntity<Pokemon> inserirNovoCurso(@RequestBody Pokemon novo){
		Pokemon res = service.cadastrarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}
	//excluir
	@DeleteMapping("/pokemons/{codigo}")
	public ResponseEntity<Pokemon> excluirPokemon(@PathVariable Integer codigo){
		service.excluirPokemon(codigo);
		return ResponseEntity.ok(null);
	}

}
