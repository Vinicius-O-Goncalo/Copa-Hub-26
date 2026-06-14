package main.java.com.fatec.copahub.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Jogador {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String posicao;
    private int numero;
    private int gols;

    public Jogador(String nome, String posicao, int numero) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.gols = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    @ManyToOne
    private Selecao selecao;
}
