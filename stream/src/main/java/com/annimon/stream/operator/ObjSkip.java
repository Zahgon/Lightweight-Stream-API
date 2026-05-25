package com.annimon.stream.operator;

import com.annimon.stream.iterator.LsaIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjSkip<T> extends LsaIterator<T> {

    private final Iterator<? extends T> iterator;

    private final long n;

    private long skipped;

    public ObjSkip(@NotNull Iterator<? extends T> iterator, long n) {
        this.iterator = iterator;
        this.n = n;
        skipped = 0;
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
