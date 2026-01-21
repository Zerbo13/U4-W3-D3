package Mattiazerbini.dao;

import Mattiazerbini.entities.Partecipazione;
import Mattiazerbini.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager entityManager;

    public PartecipazioneDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //SAVE
    public void save(Partecipazione newPartecipazione){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newPartecipazione);

        transaction.commit();

        System.out.println("La partecipazione " +newPartecipazione.getPartecipazioneId()+ "+ stato salvato nel database");
    }
}
