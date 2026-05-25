package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleBinaryOperator;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleScan extends PrimitiveExtIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoubleBinaryOperator accumulator;

    public DoubleScan(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoubleBinaryOperator accumulator) {
        this.iterator = iterator;
        this.accumulator = accumulator;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
