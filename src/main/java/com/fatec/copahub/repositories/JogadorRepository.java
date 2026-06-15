package com.fatec.copahub.repositories;
import com.fatec.copahub.entities.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    
}
