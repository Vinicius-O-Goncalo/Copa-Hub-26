package com.fatec.copahub.DTOs;

import java.time.LocalDate;

public record PartidaResponseDTO(
    Long id,
    String mandante,
    String visitante,
    Integer golsMandante,
    Integer golsVisitante,
    LocalDate data
) {
    
}
