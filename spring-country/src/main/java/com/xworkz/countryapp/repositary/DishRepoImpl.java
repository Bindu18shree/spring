package com.xworkz.countryapp.repositary;

import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.entity.DishEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class DishRepoImpl implements DishRepo {


    @Override
    public boolean save(DishEntity dishEntity) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("country");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            entityManager.getTransaction().begin();
            entityManager.persist(dishEntity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception exception) {
            entityManager.getTransaction().rollback();
            return false;
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }
    }


