package com.searchio.interview.fetcher;

import com.searchio.interview.model.Entity;

import java.util.Objects;

final class TestEntity implements Entity {
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
