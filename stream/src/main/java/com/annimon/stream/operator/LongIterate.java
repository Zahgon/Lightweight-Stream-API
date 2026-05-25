package com.annimon.stream.operator;

import com.annimon.stream.function.LongUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongIterate extends PrimitiveIterator.OfLong {

    private final LongUnaryOperator op;

    private long current;

    public LongIterate(long seed, @NotNull LongUnaryOperator f) {
        this.op = f;
        current = seed;
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
