package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;

/**
 * A Fetcher that can get, list, save and clear an {@link Entity}
 */
public interface Fetcher {

    /**
     * Return an {@link Entity} based on the passed in id
     *
     * @param id
     * @return the entity or null
     */
    Entity get(long id);

    /**
     * Saves an entity via the Fetcher, if the {@link Entity#getIdentifier()} does not exist a new entry will be created.
     * If the {@link Entity#getIdentifier()} does exist the value will be updated
     *
     * @param entity the value to persist
     * @return
     */
    Entity save(Entity entity);

    /**
     * Will clear all entities in the {@link Fetcher}
     */
    void clear();
}
