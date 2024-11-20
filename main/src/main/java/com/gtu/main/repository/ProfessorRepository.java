package com.gtu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gtu.main.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
