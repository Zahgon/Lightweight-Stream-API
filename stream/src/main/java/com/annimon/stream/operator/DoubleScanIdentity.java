package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleBinaryOperator;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleScanIdentity extends PrimitiveExtIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final double identity;

    private final DoubleBinaryOperator accumulator;

    public DoubleScanIdentity(@NotNull PrimitiveIterator.OfDouble iterator, double identity, @NotNull DoubleBinaryOperator accumulator) {
        this.iterator = iterator;
        this.identity = identity;
        this.accumulator = accumulator;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
