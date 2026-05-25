package com.annimon.stream.iterator;

import java.util.Iterator;

/**
 * Iterator wrapper that supports indexing.
 *
 * @param <T> the type of the iterator elements
 * @since 1.1.6
 */
@SuppressWarnings("WeakerAccess")
public class IndexedIterator<T> implements Iterator<T> {

    private final Iterator<? extends T> iterator;

    private final int step;

    private int index;

    public IndexedIterator(Iterator<? extends T> iterator) {
        this(0, 1, iterator);
    }

    public IndexedIterator(int start, int step, Iterator<? extends T> iterator) {
        this.iterator = iterator;
        this.step = step;
        index = start;
    }

    public int getIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
