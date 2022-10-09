package org.banking.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY
        = Persistence.createEntityManagerFactory("HW16");


    public static  EntityManagerFactory getEntityManagerFactory(){
        return  ENTITY_MANAGER_FACTORY;
    }
}
