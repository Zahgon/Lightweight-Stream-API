package com.annimon.stream.operator;

import com.annimon.stream.function.IntPredicate;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class IntFilter extends PrimitiveIterator.OfInt {

    private final PrimitiveIterator.OfInt iterator;

    private final IntPredicate predicate;

    private boolean hasNext, hasNextEvaluated;

    private int next;

    public IntFilter(@NotNull PrimitiveIterator.OfInt iterator, @NotNull IntPredicate predicate) {
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

    private void nextIteration() {
        while (iterator.hasNext()) {
            next = iterator.nextInt();
            if (predicate.test(next)) {
                hasNext = true;
                return;
            }
        }
        hasNext = false;
    }
}
