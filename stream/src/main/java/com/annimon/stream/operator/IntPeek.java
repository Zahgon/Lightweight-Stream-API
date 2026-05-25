package com.annimon.stream.operator;

import com.annimon.stream.function.IntConsumer;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntPeek extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfInt iterator;

    private final IntConsumer action;

    public IntPeek(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntConsumer action) {
        this.iterator = iterator;
        this.action = action;
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
