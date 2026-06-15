package com.fatec.copahub.services;

import java.util.List;

import com.fatec.copahub.DTOs.PartidaRequest;
import com.fatec.copahub.entities.Partida;
import com.fatec.copahub.entities.Selecao;
import com.fatec.copahub.repositories.PartidaRepository;
import com.fatec.copahub.repositories.SelecaoRepository;

public class PartidaService {
    
    private final PartidaRepository repository;
    private final SelecaoRepository selecaoRepository;

    public PartidaService(
            PartidaRepository repository,
            SelecaoRepository selecaoRepository) {

        this.repository = repository;
        this.selecaoRepository = selecaoRepository;
    }

    public List<Partida> listar() {
        return repository.findAll();
    }

    public Partida criar(PartidaRequest dto) {

        Selecao mandante = selecaoRepository
                .findById(dto.mandanteId())
                .orElseThrow();

        Selecao visitante = selecaoRepository
                .findById(dto.visitanteId())
                .orElseThrow();

        Partida partida = new Partida();

        partida.setData(dto.data());
        partida.setMandante(mandante);
        partida.setVisitante(visitante);
        partida.setGolsMandante(dto.golsMandante());
        partida.setGolsVisitante(dto.golsVisitante());

        return repository.save(partida);
    }

}
