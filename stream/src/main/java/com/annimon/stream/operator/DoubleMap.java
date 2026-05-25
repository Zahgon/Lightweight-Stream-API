package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleMap extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoubleUnaryOperator mapper;

    public DoubleMap(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoubleUnaryOperator mapper) {
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
