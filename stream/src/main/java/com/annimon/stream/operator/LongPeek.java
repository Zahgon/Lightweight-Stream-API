package com.annimon.stream.operator;

import com.annimon.stream.function.LongConsumer;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongPeek extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongConsumer action;

    public LongPeek(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongConsumer action) {
        this.iterator = iterator;
        this.action = action;
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
