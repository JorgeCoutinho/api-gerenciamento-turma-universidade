package com.gtu.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtu.main.model.Professor;
import com.gtu.main.repository.ProfessorRepository;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    // Metodo para Listar todos os professors
    public List<Professor> listar(){
        return professorRepository.findAll();
    }

    // Método para buscar um professor pelo id
    public Optional<Professor> buscarPorId(Long id){
        return professorRepository.findById(id);
    }

    // Método para salvar um professor
    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    // Método para deletar um professor
    public void deletar(Long id){
        professorRepository.deleteById(id);
    }

    

}
