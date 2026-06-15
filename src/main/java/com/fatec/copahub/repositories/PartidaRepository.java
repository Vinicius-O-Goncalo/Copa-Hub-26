package com.fatec.copahub.repositories;
import com.fatec.copahub.entities.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
    
}
