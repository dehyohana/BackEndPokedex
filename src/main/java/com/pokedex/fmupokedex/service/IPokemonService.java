package com.pokedex.fmupokedex.service;

import java.util.ArrayList;
import java.util.List;

import com.pokedex.fmupokedex.model.Pokemon;

public interface IPokemonService {
	public ArrayList<Pokemon> recuperarTodos();
	public Pokemon recuperarPeloCodigo(Integer codigo);
	public Pokemon cadastrarNovo(Pokemon novo);
	public void excluirPokemon(Integer Id);
	public List<Pokemon> encontrarPelaPagina(int pageNo, int pageSize);

}
