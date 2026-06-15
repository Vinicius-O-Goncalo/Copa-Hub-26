package com.fatec.copahub.DTOs;
 
public record JogadorRequestDTO (
    String nome,
        Integer numero,
        String posicao,
        Integer gols,
        Long selecaoId

    
) {
}

