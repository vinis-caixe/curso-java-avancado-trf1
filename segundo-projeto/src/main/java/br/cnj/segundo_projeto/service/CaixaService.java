package br.cnj.segundo_projeto.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.cnj.segundo_projeto.model.entities.Caixa;

@Service
public class CaixaService {
    
    public List<Caixa> pegarTodasAsCaixas() {
        Caixa caixa1 = new Caixa();
        caixa1.setId_caixa(1L);
        caixa1.setNm_caixa("Caixa 1");
        caixa1.setDs_caixa("Primeira caixa");
        caixa1.setIn_sistema(true);

        Caixa caixa2 = new Caixa();
        caixa2.setId_caixa(2L);
        caixa2.setNm_caixa("Caixa 2");
        caixa2.setDs_caixa("Segunda caixa");
        caixa2.setIn_sistema(true);

        return Arrays.asList(caixa1, caixa2);
    }
}
