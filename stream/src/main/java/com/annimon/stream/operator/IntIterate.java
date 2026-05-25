package com.annimon.stream.operator;

import com.annimon.stream.function.IntUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntIterate extends PrimitiveIterator.OfInt {

    private final IntUnaryOperator op;

    private int current;

    public IntIterate(int seed, @NotNull IntUnaryOperator f) {
        this.op = f;
        current = seed;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
