package com.annimon.stream.operator;

import com.annimon.stream.function.DoublePredicate;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class DoubleTakeWhile extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoublePredicate predicate;

    private double next;

    private boolean nextPresent;

    private boolean hasNextComputed, hasNext;

    public DoubleTakeWhile(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoublePredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean getNextAndTest() {
        next = iterator.nextDouble();
        hasNext = predicate.test(next);
        return hasNext;
    }
}
