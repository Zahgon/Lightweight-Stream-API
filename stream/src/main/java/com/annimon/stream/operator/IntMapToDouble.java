package com.annimon.stream.operator;

import com.annimon.stream.function.IntToDoubleFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntMapToDouble extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfInt iterator;

    private final IntToDoubleFunction mapper;

    public IntMapToDouble(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntToDoubleFunction mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
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
