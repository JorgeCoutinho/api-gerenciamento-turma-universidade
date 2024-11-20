package com.gtu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtu.main.Service.EstudanteService;
import com.gtu.main.model.Estudante;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    // Método para listar todos os estudantes
    @GetMapping
    public List<Estudante> listar() {
        return estudanteService.listar();
    }
    
    // Método para buscar um estudante pelo id
    @GetMapping("/{id}")
    public Estudante buscarPorId(@PathVariable Long id) {
        return estudanteService.buscarPorId(id).orElse(null);
    }

    // Método para salva um estudante
    @PostMapping
    public Estudante salvar(@RequestBody Estudante estudante) {
        return estudanteService.salvar(estudante);
    }
    
    // Método para atualizar um estudante
    @PutMapping("/{id}")
    public Estudante atualizar(@PathVariable Long id, @RequestBody Estudante estudante) {
        estudante.setId(id);
        return estudanteService.salvar(estudante);
    }
    

    // Método para deletar um estudante
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        estudanteService.deletar(id);
    }
    


}
