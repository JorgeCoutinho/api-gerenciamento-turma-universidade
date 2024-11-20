package com.gtu.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtu.main.model.Curso;
import com.gtu.main.repository.CursoRepository;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    // Metodo para Listar todos os cursos
    public List<Curso> listar(){
        return cursoRepository.findAll();
    }

    // Método para buscar um curso pelo id
    public Optional<Curso> buscarPorId(Long id){
        return cursoRepository.findById(id);
    }

    // Método para salvar um curso
    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);
    }

    // Método para deletar um curso
    public void deletar(Long id){
        cursoRepository.deleteById(id);
    }

    

}
