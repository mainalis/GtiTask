package com.gti.spring.entity;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by sushilmainali on 25/02/2018.
 */
@Component
public class AnimalDao {
    @PersistenceContext
    private EntityManager em;


    @Transactional
    public void persist() {

        MountainGoat tempMountanGoat = new MountainGoat();
        tempMountanGoat.birthDate = new Date();
        tempMountanGoat.breed = "dddds";
        tempMountanGoat.color = "white";
        tempMountanGoat.hasHorns = true;
        tempMountanGoat.givenName = "mad goat";
        tempMountanGoat.height = 10.12;
        tempMountanGoat.weight = 150;
        tempMountanGoat.scientificName ="ddfddd";
        tempMountanGoat.sex= "Male";
        tempMountanGoat.setCanClimbSteepSlopes(true);
        tempMountanGoat.setGazedOnMountainSlope(true);
        em.persist(tempMountanGoat);
    }


    @Transactional
    public void persistGMountainGoat(Animal animal) {

//
//        MountainGoat tempMountanGoat = (MountainGoat)animal;
//        tempMountanGoat.birthDate = new Date();
//        tempMountanGoat.breed = "dddds";
//        tempMountanGoat.color = "white";
//        tempMountanGoat.hasHorns = true;
//        tempMountanGoat.givenName = "mad goat";
//        tempMountanGoat.height = 10.12;
//        tempMountanGoat.weight = 150;
//        tempMountanGoat.scientificName ="ddfddd";
//        tempMountanGoat.sex= "Male";
//        tempMountanGoat.setCanClimbSteepSlopes(true);
//        tempMountanGoat.setGazedOnMountainSlope(true);

        em.persist(animal);
    }

    // Retrieves all the guests:
    public List<Animal> getAllAnimals() {
        TypedQuery<Animal> query = em.createQuery(
                "SELECT a FROM Animal a ORDER BY a.id", Animal.class);
        return query.getResultList();
    }

}
