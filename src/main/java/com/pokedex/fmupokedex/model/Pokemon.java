package com.pokedex.fmupokedex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemon")
public class Pokemon {
	@Id
	@Column(name="id", nullable = false)
	private Integer id;
	
	@Column(name="pokemon", length = 10)
	private String pokemon_name;
	
	@Column(name="type_1", length = 10)
	private String type1;
	
	@Column(name="type_2", length = 10)
	private String type2;
	
	@Column(name="height_m")
	private Double height;
	
	@Column(name="weight_kg")
	private Double weight;
	
	@Column(name="description", length = 200)
	private String description;
	
	@Column(name="ability", length = 10)
	private String ability;
	
	@Column(name="img_url", length = 200)
	private String img_url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPokemon_name() {
		return pokemon_name;
	}

	public void setPokemon_name(String pokemon_name) {
		this.pokemon_name = pokemon_name;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	
	

}
