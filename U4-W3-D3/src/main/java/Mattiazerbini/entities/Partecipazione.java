package Mattiazerbini.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "partecipazioni")

public class Partecipazione {

    @Id
    @GeneratedValue
    @Column(name = "partecipazione_id")
    private UUID partecipazioneId;

    @Column(name = "stato", nullable = false, length = 30)
    private String stato;

    public Partecipazione(){
    }

    public Partecipazione(String stato){
        this.stato = stato;
    }

    public UUID getPartecipazioneId() {
        return partecipazioneId;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
