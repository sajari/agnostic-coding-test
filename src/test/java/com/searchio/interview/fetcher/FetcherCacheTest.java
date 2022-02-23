package com.searchio.interview.fetcher;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class FetcherCacheTest {

    private FetcherCache fetcher;

    @BeforeEach
    void setUp() {
        fetcher = new FetcherCache();
    }

    @AfterEach
    void tearDown() {
        fetcher = null;
    }

    @Test
    void get() {
        fail("not implemented");
    }

    @Test
    void save() {
        fail("not implemented");
    }

    @Test
    void list() {
        fail("not implemented");
    }

    @Test
    void clear() {
        fail("not implemented");
    }
}