package Mattiazerbini.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", nullable = false, length = 30)
    private String nome;

    @Column(name = "cognome", nullable = false, length = 30)
    private String cognome;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "dataNascita", nullable = false)
    private LocalDate dataNascita;

    @Column(name = "sesso", nullable = false, length = 1)
    private String sesso;

    @Column(name = "listaPartecipazioni", nullable = false)
    private String listaPartecipazioni;

    public Persona(){
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, String sesso, String listaPartecipazioni){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
        this.listaPartecipazioni = listaPartecipazioni;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(String listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }
}
