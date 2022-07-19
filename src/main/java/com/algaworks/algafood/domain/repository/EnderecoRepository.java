package com.algaworks.algafood.domain.repository;

import java.util.List;
import com.algaworks.algafood.domain.model.Endereco;

public interface EnderecoRepository {

	List<Endereco> todos();

	Endereco porId(Long id);

	Endereco adicionar(Endereco endereco);

	void remover(Endereco endereco);

}
