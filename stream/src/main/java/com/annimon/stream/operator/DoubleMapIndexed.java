package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedDoubleUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIndexedIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleMapIndexed extends PrimitiveIterator.OfDouble {

    private final PrimitiveIndexedIterator.OfDouble iterator;

    private final IndexedDoubleUnaryOperator mapper;

    public DoubleMapIndexed(@NotNull PrimitiveIndexedIterator.OfDouble iterator, @NotNull IndexedDoubleUnaryOperator mapper) {
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
