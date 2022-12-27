package com.pokedex.fmupokedex.dao;

import org.springframework.data.repository.CrudRepository;

import com.pokedex.fmupokedex.model.Pokemon;

public interface PokemonDAO extends CrudRepository<Pokemon,Integer>{

}
