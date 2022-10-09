package org.banking.base.repository;

import jakarta.persistence.EntityManager;
import org.banking.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseRepository<E extends BaseEntity<ID>,ID extends Serializable> {
    E save (E e);

    E update (E e);

    void delete (E e);

    E findById (ID id);

    List<E> findAll();

    boolean isExistsById(ID id);

    Long countAll();

    EntityManager getEntityManager();
}