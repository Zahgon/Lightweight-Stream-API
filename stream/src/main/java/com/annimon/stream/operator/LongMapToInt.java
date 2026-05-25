package com.annimon.stream.operator;

import com.annimon.stream.function.LongToIntFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongMapToInt extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfLong iterator;

    private final LongToIntFunction mapper;

    public LongMapToInt(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongToIntFunction mapper) {
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
