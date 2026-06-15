package com.fatec.copahub.repositories;
import com.fatec.copahub.entities.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    
    List<Jogador> findAllbyOrderbyGolsDesc();
}
