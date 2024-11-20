package com.gtu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtu.main.model.Estudante;

public interface EstudandeRepository extends JpaRepository<Estudante, Long> {

}
