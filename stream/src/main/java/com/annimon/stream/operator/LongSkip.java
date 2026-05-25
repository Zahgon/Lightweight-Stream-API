package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongSkip extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final long n;

    private long skipped;

    public LongSkip(@NotNull PrimitiveIterator.OfLong iterator, long n) {
        this.iterator = iterator;
        this.n = n;
        skipped = 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
