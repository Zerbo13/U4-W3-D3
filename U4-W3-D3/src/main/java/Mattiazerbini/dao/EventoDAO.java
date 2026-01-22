package Mattiazerbini.dao;

import Mattiazerbini.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager entityManager;

    public EventoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //SAVE
    public void save(Evento newEvento){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newEvento);

        transaction.commit();

        System.out.println("L'evento " +newEvento.getTitolo()+ " stato salvatonel database");
    }

}
