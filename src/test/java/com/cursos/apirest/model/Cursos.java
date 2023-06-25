package com.cursos.apirest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long codigo;

    private String nome;
    private String descricao;
    private String link;

    public long getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getLink() {
        return link;
    }

    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setLink(String link) {
        this.link = link;
    }

    
    
    
}
