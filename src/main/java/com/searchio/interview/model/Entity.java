package com.searchio.interview.model;

/**
 * An Entity with a source and identifier
 */
public interface Entity {

    long getIdentifier();

    Object getSource();
}
