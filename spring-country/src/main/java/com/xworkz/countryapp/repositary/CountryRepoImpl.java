package com.xworkz.countryapp.repositary;

import com.xworkz.countryapp.dto.CountryDto;
import com.xworkz.countryapp.entity.CountryEntity;
import com.xworkz.countryapp.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class CountryRepoImpl implements CountryRepo {

    @Override
    public boolean save(CountryEntity countryEntity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("country");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            entityManager.getTransaction().begin();
            entityManager.persist(countryEntity);
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

