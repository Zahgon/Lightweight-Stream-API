package com.annimon.stream.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Extended iterator for common purposes.
 *
 * @param <T> the type of the inner value
 */
public abstract class LsaExtIterator<T> implements Iterator<T> {

    protected T next;

    protected boolean hasNext, isInit;

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract void nextIteration();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
