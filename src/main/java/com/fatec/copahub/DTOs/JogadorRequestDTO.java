package main.java.com.fatec.copahub.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record JogadorRequestDTO (
    @NotBlank(message = "O nome do jogador é obrigatório") 
    @Size(min = 3, max = 50, message = "O nome do jogador deve conter entre 3 e 50 caracteres")
    String nome,

    @NotBlank(message = "O número de gols do jogador é obrigatório") 
    @Size(min = 1, max = 100, message = "O número de gols do jogador deve conter entre 1 e 100 caracteres")
    String gols,

    @NotNull(message = "O ID da seleção é obrigatório")
    Long selecaoId

    
) {
}

