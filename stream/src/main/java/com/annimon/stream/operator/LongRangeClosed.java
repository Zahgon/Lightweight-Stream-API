package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;

public class LongRangeClosed extends PrimitiveIterator.OfLong {

    private final long endInclusive;

    private long current;

    private boolean hasNext;

    public LongRangeClosed(long startInclusive, long endInclusive) {
        this.endInclusive = endInclusive;
        current = startInclusive;
        hasNext = current <= endInclusive;
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
