package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Categoria;

public class CategoriaDTO {
    private Integer id;
    private String nome;

    public CategoriaDTO(){}

    public CategoriaDTO(Categoria obj){
        id = obj.getId();
        nome = obj.getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
