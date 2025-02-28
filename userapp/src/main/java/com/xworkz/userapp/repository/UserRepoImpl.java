package com.xworkz.userapp.repository;

import com.xworkz.userapp.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {

   public EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("userapp");


    @Override
    public boolean save(UserEntity userEntity) {
        boolean isUserUpdated = false;
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            if (userEntity != null) {

                entityManager.getTransaction().begin();
                entityManager.persist(userEntity);
                entityManager.getTransaction().commit();
                entityManager.close();
                isUserUpdated = true;
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
        return isUserUpdated;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createNamedQuery("getAllData");
        List<UserEntity> userEntities = query.getResultList();
        entityManager.close();
        return userEntities;

    }

    @Override
    public void deleteById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("deleteById").setParameter("id", id).executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
//        entityManagerFactory.close();
    }

    @Override
    public UserEntity getUserById(Integer id) {
       EntityManager entityManager= entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
      UserEntity user = (UserEntity) entityManager.createNamedQuery("getUserById").setParameter("id", id).getSingleResult();
      entityManager.close();
        return user;
    }

    @Override
    public boolean updateUser(UserEntity userEntity) {

      boolean  isUpdated = false;
     EntityManager entityManager =   entityManagerFactory.createEntityManager();
     entityManager.getTransaction().begin();
     entityManager.merge(userEntity);
     entityManager.getTransaction().commit();
     entityManager.close();
     isUpdated=true;
     return isUpdated;
    }

}
