package main.java.com.fatec.copahub.entities;

@Entity
public class Partida {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate data;

    @ManyToOne
    private Selecao mandante;

    @ManyToOne
    private Selecao visitante;

    private int golsMandante;
    private int golsVisitante;

    public Partida(LocalDate data, Selecao mandante, Selecao visitante) {
        this.data = data;
        this.mandante = mandante;
        this.visitante = visitante;
        this.golsMandante = 0;
        this.golsVisitante = 0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Selecao getMandante() {
        return mandante;
    }

    public void setMandante(Selecao mandante) {
        this.mandante = mandante;
    }

    public Selecao getVisitante() {
        return visitante;
    }

    public void setVisitante(Selecao visitante) {
        this.visitante = visitante;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }
}