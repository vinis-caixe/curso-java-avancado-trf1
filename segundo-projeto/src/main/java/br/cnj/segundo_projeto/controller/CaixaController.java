package br.cnj.segundo_projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cnj.segundo_projeto.model.entities.Caixa;
import br.cnj.segundo_projeto.service.CaixaService;

@RestController
@RequestMapping("/api/caixa")
public class CaixaController {

    private CaixaService caixaService;

    @Autowired
    protected void setCaixaService(CaixaService caixaService) {
        this.caixaService = caixaService;
    }

    @GetMapping
    public ResponseEntity<List<Caixa>> pegarTodasAsCaixas() {
        List<Caixa> caixas = caixaService.pegarTodasAsCaixas();
        return ResponseEntity.ok(caixas);
    }
    
}
