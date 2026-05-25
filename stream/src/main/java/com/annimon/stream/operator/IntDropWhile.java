package com.annimon.stream.operator;

import com.annimon.stream.function.IntPredicate;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntDropWhile extends PrimitiveExtIterator.OfInt {

    private final PrimitiveIterator.OfInt iterator;

    private final IntPredicate predicate;

    public IntDropWhile(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntPredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
