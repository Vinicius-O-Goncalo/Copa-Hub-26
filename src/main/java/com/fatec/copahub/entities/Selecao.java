package com.fatec.copahub.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Selecao {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String grupo;

    public Selecao() {
    }

    public Selecao(Long id, String nome, String grupo) {
        this.id = id;
        this.nome = nome;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }


}
