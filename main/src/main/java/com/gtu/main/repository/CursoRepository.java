package com.gtu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtu.main.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
