package com.fatec.copahub.services;

import com.fatec.copahub.DTOs.SelecaoRequestDTO;
import com.fatec.copahub.entities.Selecao;
import com.fatec.copahub.repositories.SelecaoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SelecaoService {
    
    private final SelecaoRepository repository;

    public SelecaoService(SelecaoRepository repository) {
        this.repository = repository;
    }

    public List<Selecao> listar() {
        return repository.findAll();
    }

    public Selecao buscar(Long id) {
        return repository.findById(id)
                .orElseThrow();
    }

    public Selecao criar(SelecaoRequestDTO dto) {

        Selecao selecao = new Selecao();

        selecao.setNome(dto.nome());
        selecao.setGrupo(dto.grupo());

        return repository.save(selecao);
    }

    public Selecao atualizar(Long id, SelecaoRequestDTO dto) {

        Selecao selecao = buscar(id);

        selecao.setNome(dto.nome());
        selecao.setGrupo(dto.grupo());

        return repository.save(selecao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
