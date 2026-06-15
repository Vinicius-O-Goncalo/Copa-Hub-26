package com.fatec.copahub.DTOs;

public record JogadorResponseDTO(
    Long id,
    String nome,
    Integer numero,
    String posicao,
    Integer gols,
    String selecao
    
) {
   
}