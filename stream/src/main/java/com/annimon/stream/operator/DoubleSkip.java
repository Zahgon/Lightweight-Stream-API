package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleSkip extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final long n;

    private long skipped;

    public DoubleSkip(@NotNull PrimitiveIterator.OfDouble iterator, long n) {
        this.iterator = iterator;
        this.n = n;
        skipped = 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
