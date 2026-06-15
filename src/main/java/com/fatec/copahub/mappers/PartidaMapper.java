package com.fatec.copahub.mappers;

import org.springframework.stereotype.Component;

import com.fatec.copahub.DTOs.PartidaResponseDTO;
import com.fatec.copahub.entities.Partida;

@Component
public class PartidaMapper {
    
    public PartidaResponseDTO toDTO(Partida partida) {

        return new PartidaResponseDTO(
                partida.getId(),
                partida.getMandante().getNome(),
                partida.getVisitante().getNome(),
                partida.getGolsMandante(),
                partida.getGolsVisitante(),
                partida.getData()
        );
    }
}
