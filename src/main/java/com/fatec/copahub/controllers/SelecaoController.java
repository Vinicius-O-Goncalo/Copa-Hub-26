package com.fatec.copahub.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.copahub.DTOs.SelecaoRequestDTO;
import com.fatec.copahub.DTOs.SelecaoResponse;
import com.fatec.copahub.mappers.SelecaoMapper;
import com.fatec.copahub.services.SelecaoService;

@RestController
@RequestMapping("/selecoes")
@CrossOrigin(origins = "*")
public class SelecaoController {
    
    private final SelecaoService service;
    private final SelecaoMapper mapper;

    public SelecaoController(
            SelecaoService service,
            SelecaoMapper mapper) {

        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<SelecaoResponse> listar() {

        return service.listar()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @PostMapping
    public SelecaoResponse criar(
            @RequestBody SelecaoRequestDTO dto) {

        return mapper.toDTO(
                service.criar(dto)
        );
    }

}
