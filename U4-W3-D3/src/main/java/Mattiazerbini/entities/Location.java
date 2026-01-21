package Mattiazerbini.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "location")

public class Location {

    @Id
    @GeneratedValue
    @Column(name = "location_id")
    private UUID locationId;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "citta", nullable = false, length = 30)
    private String citta;

    public Location(){

    }

    public Location(String nome, String citta){
        this.nome = nome;
        this.citta = citta;
    }
    public UUID getLocationId() {
        return locationId;
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
