package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CacheFetcherTest {

    private CacheFetcher fetcher;
    private HashMap<Long, Entity> entityMap;

    @BeforeEach
    void setUp() {
        entityMap= new HashMap<>();
        fetcher = new CacheFetcher(new RemoteStoreFetcher(entityMap), 2);
    }

    @AfterEach
    void tearDown() {
        fetcher = null;
        entityMap = null;
    }

    @Test
    void testCachingMoreThanLimit() {
        fail("not implemented");
    }

    @Test
    void save() {
        fetcher.save(new TestEntity(1L, this));
        assertEquals(1, entityMap.size());
    }

    @Test
    void clear() {
        fetcher.save(new TestEntity(1L, this));
        assertEquals(1, entityMap.size());

        fetcher.clear();
        assertEquals(0, entityMap.size());
    }
}