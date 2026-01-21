package Mattiazerbini.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "location")

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "citta", nullable = false, length = 30)
    private String citta;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }
}
