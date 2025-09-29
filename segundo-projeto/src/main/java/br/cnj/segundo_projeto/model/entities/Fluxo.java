package br.cnj.segundo_projeto.model.entities;

import java.time.LocalDate;

public class Fluxo {

    private Long id_fluxo;
    private Long cd_fluxo;
    private String ds_fluxo;
    private Boolean in_ativo;
    private Long qt_prazo;
    private Boolean in_publicado;
    private LocalDate dt_inicio_publicacao;
    private LocalDate dt_fim_publicacao;
    private String ds_xml;
    private LocalDate dt_ultima_publicacao;
    
}
