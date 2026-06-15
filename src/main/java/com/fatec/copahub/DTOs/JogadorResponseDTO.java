package main.java.com.fatec.copahub.DTOs;

import main.java.com.fatec.copahub.entities.Jogador;

public record JogadorResponseDTO(
    Long id,
    String name,
    String posicao,
    Integer numero,
    Integer gols
    
) {
    public JogadorResponseDTO(Jogador jogador) {
        this(jogador.getId(), jogador.getNome(), jogador.getPosicao(), jogador.getNumero(), jogador.getGols());
    }
}