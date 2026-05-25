package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleArray extends PrimitiveIterator.OfDouble {

    private final double[] values;

    private int index;

    public DoubleArray(@NotNull double[] values) {
        this.values = values;
        index = 0;
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
