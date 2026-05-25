package com.annimon.stream.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Abstract iterator with implemented {@code remove} method.
 * @param <T> the type of the elements
 */
public abstract class LsaIterator<T> implements Iterator<T> {

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public final T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public abstract T nextIteration();
}
