package com.annimon.stream.operator;

import com.annimon.stream.function.LongPredicate;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongDropWhile extends PrimitiveExtIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongPredicate predicate;

    public LongDropWhile(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongPredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
