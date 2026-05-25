package com.annimon.stream.operator;

import com.annimon.stream.function.LongUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongMap extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongUnaryOperator mapper;

    public LongMap(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongUnaryOperator mapper) {
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
