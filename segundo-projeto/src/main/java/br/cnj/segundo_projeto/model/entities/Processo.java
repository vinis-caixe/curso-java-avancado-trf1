package br.cnj.segundo_projeto.model.entities;

import java.time.LocalDate;

public class Processo {

    private Long id;
    private Long nr_processo;
    private Long nr_processo_origem;
    private String ds_complemento;
    private LocalDate dt_inicio;
    private Long id_jbpm;
    private LocalDate dt_fim;
    private Long nr_duracao;
    private String nm_actor_id;
    private String ds_nm_usu_cadastro_processo;
    private Long id_pk_tb_processo_pg;
    private Long id_sessao_pg;
    private Long nr_processo_temp;
    
}
