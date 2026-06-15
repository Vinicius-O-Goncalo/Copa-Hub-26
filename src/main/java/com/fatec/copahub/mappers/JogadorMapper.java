package com.fatec.copahub.mappers;

import org.springframework.stereotype.Component;

import com.fatec.copahub.DTOs.JogadorResponseDTO;
import com.fatec.copahub.entities.Jogador;

@Component
public class JogadorMapper {
    
    public JogadorResponseDTO toDTO(Jogador jogador) {

        return new JogadorResponseDTO(
                jogador.getId(),
                jogador.getNome(),
                jogador.getNumero(),
                jogador.getPosicao(),
                jogador.getGols(),
                jogador.getSelecao().getNome()
        );
    }
}
