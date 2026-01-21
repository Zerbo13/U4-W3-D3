package Mattiazerbini.dao;

import Mattiazerbini.entities.Evento;
import Mattiazerbini.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager entityManager;

    public PersonaDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //SAVE
    public void save(Persona newPersona){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newPersona);

        transaction.commit();

        System.out.println("La persona " +newPersona.getNome()+ "+ stato salvato nel database");
    }

}
