package Mattiazerbini.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "eventi")

public class Evento{


    @Id // Annotazione OBBLIGATORIA. Dichiaro che questo attributo dovrà
    // corrispondere alla colonna PRIMARY KEY della tabella students

    @GeneratedValue(strategy = GenerationType.IDENTITY)// Annotazione OPZIONALE
    // però molto consigliata. Serve per chiedere al DB di generare lui
    // i valori per la PK. IDENTITY significa che invece di biginteger vogliamo usare un bigserial
    private long id;

    @Column(name = "titolo", nullable = false, length = 30)
    private String titolo;

    @Column(name = "dataEvento", nullable = false)
    private LocalDate dataEvento;

    @Column(name = "descrizione", nullable = false, length = 70)
    private String descrizione;

    @Column(name = "tipoEvento", nullable = false)
    private String tipoEvento;

    @Column(name = "numeroMassimoPartecipanti", nullable = false)
    private int numeroMassimoPartecipanti;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Partecipazione> partecipazioni;


    public Evento(){
    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, String tipoEvento, int numeroMassimoPartecipanti, Location location){
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Partecipazione> getPartecipazioni(){
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    @Override
    public String toString() {
        return "Events{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento='" + tipoEvento + '\'' +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }
}

