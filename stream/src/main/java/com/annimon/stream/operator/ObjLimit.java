package com.annimon.stream.operator;

import com.annimon.stream.iterator.LsaIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjLimit<T> extends LsaIterator<T> {

    private final Iterator<? extends T> iterator;

    private final long maxSize;

    private long index;

    public ObjLimit(@NotNull Iterator<? extends T> iterator, long maxSize) {
        this.iterator = iterator;
        this.maxSize = maxSize;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
