package com.pokedex.fmupokedex.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pokedex.fmupokedex.dao.PokemonDAO;
import com.pokedex.fmupokedex.dao.PokemonRepository;
import com.pokedex.fmupokedex.model.Pokemon;

@Service
public class PokemonImplService implements IPokemonService{
	@Autowired
	private PokemonDAO dao;
	@Override
	public ArrayList<Pokemon> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Pokemon>)dao.findAll();
	}

	@Override
	public Pokemon recuperarPeloCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Pokemon cadastrarNovo(Pokemon novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

	@Override
	public void excluirPokemon(Integer Id) {
		// TODO Auto-generated method stub
		
	}
	
	@Autowired
	private PokemonRepository repository;
	@Override
	public List<Pokemon> encontrarPelaPagina(int pageNo, int pageSize) {
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<Pokemon> pagedResult = repository.findAll(paging);
		return pagedResult.toList();
	}
	
	

}
