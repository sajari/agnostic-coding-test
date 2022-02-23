package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;

import java.util.Collection;

/**
 * A Fetcher that can get, list, save and clear an {@link Entity}
 */
public interface Fetcher {

    /**
     * Return an {@link Entity} based on the passed in id
     * @param id
     * @return the entity or null
     */
    Entity get(long id);

    /**
     * Saves an entity via the Fetcher
     * @param entity
     * @return
     */
    Entity save(Entity entity);

    /**
     * Will return a Collection of Entities
     * @return a collection of entities, or a {@link java.util.Collections#EMPTY_LIST} if non
     */
    Collection<Entity> list();

    /**
     * Will clear all entities in the implemented {@link Fetcher}
     */
    void clear();
}
