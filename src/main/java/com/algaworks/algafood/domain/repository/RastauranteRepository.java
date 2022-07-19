package com.algaworks.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.algaworks.algafood.domain.model.Restaurante;

public interface RastauranteRepository extends JpaRepository<Restaurante, Long> {}	
