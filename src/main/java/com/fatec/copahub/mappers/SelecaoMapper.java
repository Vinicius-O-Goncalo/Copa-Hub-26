package com.fatec.copahub.mappers;

import com.fatec.copahub.entities.Selecao;

import org.springframework.stereotype.Component;

import com.fatec.copahub.DTOs.SelecaoResponse;

@Component
public class SelecaoMapper {

    public SelecaoResponse toDTO(Selecao selecao) {

        return new SelecaoResponse(
                selecao.getId(),
                selecao.getNome(),
                selecao.getGrupo()
        );
    }

}
