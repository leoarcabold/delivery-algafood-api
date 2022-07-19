package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // o mysql faz o controle de geração do autoincremento
	@Column
	@EqualsAndHashCode.Exclude
	private Long id;

	@Column
	private String nome;
}
