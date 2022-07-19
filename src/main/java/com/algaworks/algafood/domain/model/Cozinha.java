package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@JsonRootName("cozinha")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "tab_cozinhas")
public class Cozinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // o mysql faz o controle de geração do autoincremento
	@Column
	@EqualsAndHashCode.Exclude
	private Long id;

	// @JsonIgnore
	//@JsonProperty("titulo")
	@Column(name = "nom_cozinha")
	private String nome;

}
