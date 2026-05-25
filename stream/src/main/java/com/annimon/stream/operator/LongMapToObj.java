package com.annimon.stream.operator;

import com.annimon.stream.function.LongFunction;
import com.annimon.stream.iterator.LsaIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongMapToObj<R> extends LsaIterator<R> {

    private final PrimitiveIterator.OfLong iterator;

    private final LongFunction<? extends R> mapper;

    public LongMapToObj(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongFunction<? extends R> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public R nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
