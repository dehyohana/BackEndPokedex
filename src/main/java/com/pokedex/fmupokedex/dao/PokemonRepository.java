package com.pokedex.fmupokedex.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pokedex.fmupokedex.model.Pokemon;

@Repository
public interface PokemonRepository extends PagingAndSortingRepository<Pokemon, Long>{

}
