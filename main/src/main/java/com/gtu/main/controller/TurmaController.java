package com.gtu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gtu.main.Service.TurmaService;
import com.gtu.main.model.Turma;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    // Método para listar todos os turmas
    @GetMapping
    public List<Turma> listar() {
        return turmaService.listar();
    }
    
    // Método para buscar um turma pelo id
    @GetMapping("/{id}")
    public Turma buscarPorId(@PathVariable Long id) {
        return turmaService.buscarPorId(id).orElse(null);
    }

    // Método para salva um turma
    @PostMapping
    public Turma salvar(@RequestBody Turma turma) {
        return turmaService.salvar(turma);
    }
    
    // Método para atualizar um turma
    @PutMapping("/{id}")
    public Turma atualizar(@PathVariable Long id, @RequestBody Turma turma) {
        turma.setId(id);
        return turmaService.salvar(turma);
    }
    

    // Método para deletar um turma
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        turmaService.deletar(id);
    }
    


}
