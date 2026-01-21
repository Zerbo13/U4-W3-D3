package Mattiazerbini.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")

public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "stato", nullable = false, length = 30)
    private String stato;

    public long getId() {
        return id;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}
