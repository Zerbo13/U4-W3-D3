package Mattiazerbini;

import Mattiazerbini.dao.*;
import Mattiazerbini.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("u4-w3-d3pu");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        LocationDAO locationDAO = new LocationDAO(em);
        EventoDAO eventoDAO = new EventoDAO(em);
        PersonaDAO personaDAO = new PersonaDAO(em);
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO(em);

        // AGGIUNTA LOCATION
        Location location = new Location("Palazzetto dello Sport", "Milano");
        Location location1 = new Location("Stadio Olimpico", "Roma");

        //SALVATAGGIO LOCATION
        locationDAO.save(location);
        locationDAO.save(location1);

        // AGGIUNTA EVENTO
        Evento evento = new Evento(
                "Concerto Rock",
                LocalDate.of(2025, 6, 20),
                "Concerto live",
                "PUBBLICO",
                5000,
                location
        );

        Evento evento1 = new Evento(
                "Concerto Rap",
                LocalDate.of(2026, 4, 15),
                "Esibizione",
                "PUBBLICO",
                200,
                location
        );

        //SALVATAGGIO EVENTO
        eventoDAO.save(evento);
        eventoDAO.save(evento1);

        // AGGIUNTA PERSONA
        Persona persona = new Persona(
                "Mario",
                "Rossi",
                "mario.rossi@email.it",
                LocalDate.of(1995, 3, 15),
                "M"
        );

        //SALVATAGGIO PERSONA
        personaDAO.save(persona);

        // AGGIUNTA PARTECIPAZIONE
        Partecipazione partecipazione =
                new Partecipazione("CONFERMATA", persona, evento);

        //SALVATAGGIO PARTECIPAZIONE
        partecipazioneDAO.save(partecipazione);

        em.close();
        emf.close();
    }
}
