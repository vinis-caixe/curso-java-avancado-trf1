package br.cnj.segundo_projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/documento")
public class DocumentoController {
    
    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("teste realizado com sucesso");
    }
    
}
