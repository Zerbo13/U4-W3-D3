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

    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    public Partecipazione() {}

    public Partecipazione(String stato, Persona persona, Evento evento) {
        this.stato = stato;
        this.persona = persona;
        this.evento = evento;
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
