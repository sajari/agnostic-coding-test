package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RemoteStoreFetcherTest {

    private Fetcher fetcher;

    @BeforeEach
    void setUp() {
        Entity entity = new TestEntity(1L, this);
        Map<Long, Entity> entityHashMap = new HashMap<>();
        entityHashMap.put(entity.getIdentifier(), entity);
        fetcher = new RemoteStoreFetcher(entityHashMap);
    }

    @Test
    void testGet() {
        Entity entity = fetcher.get(1);
        assertNotNull(entity);
        assertEquals(1, entity.getIdentifier());
    }

    @Test
    void testSave() {
        Entity entityToSave = new TestEntity(2L, this);
        fetcher.save(entityToSave);

        Entity savedEnity = fetcher.get(2L);
        assertNotNull(savedEnity);
    }

    @AfterEach
    void tearDown() {
        fetcher = null;
    }

}