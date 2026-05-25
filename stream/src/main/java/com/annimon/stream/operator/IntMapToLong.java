package com.annimon.stream.operator;

import com.annimon.stream.function.IntToLongFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntMapToLong extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfInt iterator;

    private final IntToLongFunction mapper;

    public IntMapToLong(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntToLongFunction mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
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
