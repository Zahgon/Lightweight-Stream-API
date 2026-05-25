package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleConsumer;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoublePeek extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoubleConsumer action;

    public DoublePeek(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoubleConsumer action) {
        this.iterator = iterator;
        this.action = action;
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
