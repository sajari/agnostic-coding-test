package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FetcherInMemoryTest {

    private Fetcher fetcher;

    @BeforeEach
    void setUp() {
        Entity entity = new TestEntity(1L, this);
        Map<Long, Entity> entityHashMap = new HashMap<>();
        entityHashMap.put(entity.getIdentifier(), entity);
        fetcher = new FetcherInMemory(entityHashMap);
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

    @Test
    void testClear() {

        Collection<Entity> list = fetcher.list();
        Entity entityToSave = new TestEntity(2L, this);
        fetcher.save(entityToSave);

        Entity savedEnity = fetcher.get(2L);
        assertNotNull(savedEnity);
    }

    @Test
    void testList() {
        Collection entities = fetcher.list();
        assertNotNull(entities);
        assertEquals(1, entities.size());
    }

    @AfterEach
    void tearDown() {
        fetcher = null;
    }

    private static final class TestEntity implements Entity {
        private final Long id;
        private final Object source;

        public TestEntity(Long id, Object source) {
            this.id = id;
            this.source = source;
        }

        @Override
        public long getIdentifier() {
            return id;
        }

        @Override
        public Object getSource() {
            return source;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestEntity that = (TestEntity) o;
            return Objects.equals(id, that.id) && Objects.equals(source, that.source);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, source);
        }
    }
}