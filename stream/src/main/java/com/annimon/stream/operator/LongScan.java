package com.annimon.stream.operator;

import com.annimon.stream.function.LongBinaryOperator;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongScan extends PrimitiveExtIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongBinaryOperator accumulator;

    public LongScan(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongBinaryOperator accumulator) {
        this.iterator = iterator;
        this.accumulator = accumulator;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
