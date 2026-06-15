package com.fatec.copahub.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fatec.copahub.DTOs.JogadorRequestDTO;
import com.fatec.copahub.entities.Jogador;
import com.fatec.copahub.entities.Selecao;
import com.fatec.copahub.repositories.JogadorRepository;
import com.fatec.copahub.repositories.SelecaoRepository;

@Service
public class JogadorService {
    private final JogadorRepository repository;
    private final SelecaoRepository selecaoRepository;

    public JogadorService(
            JogadorRepository repository,
            SelecaoRepository selecaoRepository) {

        this.repository = repository;
        this.selecaoRepository = selecaoRepository;
    }

    public List<Jogador> listar() {
        return repository.findAll();
    }

    public List<Jogador> artilharia() {
        return repository.findAllbyOrderbyGolsDesc();
    }

    public Jogador criar(JogadorRequestDTO dto) {

        Selecao selecao = selecaoRepository
                .findById(dto.selecaoId())
                .orElseThrow();

        Jogador jogador = new Jogador();

        jogador.setNome(dto.nome());
        jogador.setNumero(dto.numero());
        jogador.setPosicao(dto.posicao());
        jogador.setGols(dto.gols());
        jogador.setSelecao(selecao);

        return repository.save(jogador);
    }
}
