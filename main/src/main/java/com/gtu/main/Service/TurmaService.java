package com.gtu.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtu.main.model.Turma;
import com.gtu.main.repository.TurmaRepository;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    // Metodo para Listar todos os turmas
    public List<Turma> listar(){
        return turmaRepository.findAll();
    }

    // Método para buscar um turma pelo id
    public Optional<Turma> buscarPorId(Long id){
        return turmaRepository.findById(id);
    }

    // Método para salvar um turma
    public Turma salvar(Turma turma){
        return turmaRepository.save(turma);
    }

    // Método para deletar um turma
    public void deletar(Long id){
        turmaRepository.deleteById(id);
    }

    

}
