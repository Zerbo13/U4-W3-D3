package Mattiazerbini.dao;

import Mattiazerbini.entities.Location;
import Mattiazerbini.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager entityManager;

    public LocationDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    //SAVE
    public void save(Location newLocation){
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(newLocation);

        transaction.commit();

        System.out.println("La location " +newLocation.getNome()+ " stato salvato nel database");
    }
}
