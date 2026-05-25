package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleToIntFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleMapToInt extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoubleToIntFunction mapper;

    public DoubleMapToInt(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoubleToIntFunction mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
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
