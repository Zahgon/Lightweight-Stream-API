package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongArray extends PrimitiveIterator.OfLong {

    private final long[] values;

    private int index;

    public LongArray(@NotNull long[] values) {
        this.values = values;
        index = 0;
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
