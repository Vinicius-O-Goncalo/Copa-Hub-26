package com.fatec.copahub.DTOs;

import java.time.LocalDate;

public record PartidaRequest(
    LocalDate data,
    Long mandanteId,
    Long visitanteId,
    Integer golsMandante,
    Integer golsVisitante
) {
    
}
