package com.luisasantos.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luisasantos.senai.domain.Aluguel;

@SuppressWarnings("rawtypes")
@Repository
public interface AluguelRepository extends JpaRepository <Aluguel, Integer> {

}
