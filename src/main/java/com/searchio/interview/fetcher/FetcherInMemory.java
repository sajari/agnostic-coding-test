package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * A simple implementation of a Fetcher backed by a Map.
 */
public class FetcherInMemory implements Fetcher {

    private final Map<Long, Entity> entityMap;

    public FetcherInMemory(Map<Long, Entity> entityMap) {
        this.entityMap = entityMap;
    }

    @Override
    public Entity get(long id) {
        return entityMap.get(id);
    }

    @Override
    public Entity save(Entity entity) {
        return entityMap.put(entity.getIdentifier(), entity);
    }

    @Override
    public Collection<Entity> list() {
        return Collections.unmodifiableCollection(entityMap.values());
    }

    @Override
    public void clear() {
        entityMap.clear();
    }
}
