package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;

import java.util.Map;

/**
 * Yes, this implementation is just backed by a {@link Map}, but really it might be back by a remote store
 * an RDBMS, REST api ... something that takes time.
 * A simple implementation of a Fetcher backed by a Map. This
 */
public class RemoteStoreFetcher implements Fetcher {

    private final Map<Long, Entity> entityMap;

    public RemoteStoreFetcher(Map<Long, Entity> entityMap) {
        this.entityMap = entityMap;
    }

    @Override
    public Entity get(long id) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return entityMap.get(id);
    }

    @Override
    public Entity save(Entity entity) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entityMap.put(entity.getIdentifier(), entity);
        return entity;
    }
}
