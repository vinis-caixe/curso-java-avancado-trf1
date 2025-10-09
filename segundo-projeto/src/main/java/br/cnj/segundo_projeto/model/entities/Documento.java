package br.cnj.segundo_projeto.model.entities;

public class Documento {

    private Long id_documento;
    private String ds_documento;
    private Boolean in_ativo;
    private String ds_mimetype;
    private String ds_conteudo;
    private Long nr_tamanho;
    private Boolean in_binario;
    private Boolean in_valido;
    private String ds_identificador_storage;

    public Long getId_documento() {
        return id_documento;
    }
    public void setId_documento(Long id_documento) {
        this.id_documento = id_documento;
    }
    public String getDs_documento() {
        return ds_documento;
    }
    public void setDs_documento(String ds_documento) {
        this.ds_documento = ds_documento;
    }
    public Boolean getIn_ativo() {
        return in_ativo;
    }
    public void setIn_ativo(Boolean in_ativo) {
        this.in_ativo = in_ativo;
    }
    public String getDs_mimetype() {
        return ds_mimetype;
    }
    public void setDs_mimetype(String ds_mimetype) {
        this.ds_mimetype = ds_mimetype;
    }
    public String getDs_conteudo() {
        return ds_conteudo;
    }
    public void setDs_conteudo(String ds_conteudo) {
        this.ds_conteudo = ds_conteudo;
    }
    public Long getNr_tamanho() {
        return nr_tamanho;
    }
    public void setNr_tamanho(Long nr_tamanho) {
        this.nr_tamanho = nr_tamanho;
    }
    public Boolean getIn_binario() {
        return in_binario;
    }
    public void setIn_binario(Boolean in_binario) {
        this.in_binario = in_binario;
    }
    public Boolean getIn_valido() {
        return in_valido;
    }
    public void setIn_valido(Boolean in_valido) {
        this.in_valido = in_valido;
    }
    public String getDs_identificador_storage() {
        return ds_identificador_storage;
    }
    public void setDs_identificador_storage(String ds_identificador_storage) {
        this.ds_identificador_storage = ds_identificador_storage;
    }
    
}
