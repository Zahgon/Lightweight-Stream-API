package com.annimon.stream.operator;

import com.annimon.stream.function.DoublePredicate;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleDropWhile extends PrimitiveExtIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoublePredicate predicate;

    public DoubleDropWhile(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoublePredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
