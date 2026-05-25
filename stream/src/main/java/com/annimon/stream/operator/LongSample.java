package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongSample extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final int stepWidth;

    public LongSample(@NotNull PrimitiveIterator.OfLong iterator, int stepWidth) {
        this.iterator = iterator;
        this.stepWidth = stepWidth;
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
