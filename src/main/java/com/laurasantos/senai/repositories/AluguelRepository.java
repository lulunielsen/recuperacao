package com.laurasantos.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurasantos.senai.domain.Aluguel;

@SuppressWarnings("rawtypes")
@Repository
public interface AluguelRepository extends JpaRepository <Aluguel, Integer> {

}
