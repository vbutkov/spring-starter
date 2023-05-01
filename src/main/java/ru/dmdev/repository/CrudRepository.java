package ru.dmdev.repository;

import java.util.Optional;

public interface CrudRepository<K, E> {

    Optional<E> findById(K id);

    void delete(E entity);
}
