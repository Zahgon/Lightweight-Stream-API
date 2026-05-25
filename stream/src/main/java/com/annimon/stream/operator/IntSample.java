package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntSample extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfInt iterator;

    private final int stepWidth;

    public IntSample(@NotNull PrimitiveIterator.OfInt iterator, int stepWidth) {
        this.iterator = iterator;
        this.stepWidth = stepWidth;
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
