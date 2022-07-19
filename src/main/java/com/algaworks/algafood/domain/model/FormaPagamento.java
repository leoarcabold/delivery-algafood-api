package com.algaworks.algafood.domain.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "forma_pagamento")
public class FormaPagamento {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//o mysql faz o controle de geração do autoincremento
	@Column
	@EqualsAndHashCode.Exclude
	private Long id;

	@Column
	private String descricao;
}
