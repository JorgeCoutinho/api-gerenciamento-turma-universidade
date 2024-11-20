package com.gtu.main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtu.main.model.Estudante;
import com.gtu.main.repository.EstudandeRepository;


@Service
public class EstudanteService {

    @Autowired
    private EstudandeRepository estudanteRepository;

    // Metodo para Listar todos os estudantes
    public List<Estudante> listar(){
        return estudanteRepository.findAll();
    }

    // Método para buscar um estudante pelo id
    public Optional<Estudante> buscarPorId(Long id){
        return estudanteRepository.findById(id);
    }

    // Método para salvar um estudante
    public Estudante salvar(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    // Método para deletar um estudante
    public void deletar(Long id){
        estudanteRepository.deleteById(id);
    }

    

}
