package com.annimon.stream.operator;

import com.annimon.stream.function.IntPredicate;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class IntTakeWhile extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfInt iterator;

    private final IntPredicate predicate;

    private int next;

    private boolean nextPresent;

    private boolean hasNextComputed, hasNext;

    public IntTakeWhile(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntPredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean getNextAndTest() {
        next = iterator.nextInt();
        hasNext = predicate.test(next);
        return hasNext;
    }
}
