package br.cnj.segundo_projeto.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "caixa")
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_caixa;
    @Column(name = "nome")
    private String nm_caixa;
    @Column(name = "descricao")
    private String ds_caixa;
    @Column(name = "il_ativo")
    private Boolean in_sistema;

    public Long getId_caixa() {
        return id_caixa;
    }
    public void setId_caixa(Long id_caixa) {
        this.id_caixa = id_caixa;
    }
    public String getNm_caixa() {
        return nm_caixa;
    }
    public void setNm_caixa(String nm_caixa) {
        this.nm_caixa = nm_caixa;
    }
    public String getDs_caixa() {
        return ds_caixa;
    }
    public void setDs_caixa(String ds_caixa) {
        this.ds_caixa = ds_caixa;
    }
    public Boolean getIn_sistema() {
        return in_sistema;
    }
    public void setIn_sistema(Boolean in_sistema) {
        this.in_sistema = in_sistema;
    }
    
}
