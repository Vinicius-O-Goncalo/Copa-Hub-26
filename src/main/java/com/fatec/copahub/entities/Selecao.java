package main.java.com.fatec.copahub.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Selecao {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String grupo;
}
