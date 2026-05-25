package com.annimon.stream.operator;

import com.annimon.stream.function.LongPredicate;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class LongFilter extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongPredicate predicate;

    private boolean hasNext, hasNextEvaluated;

    private long next;

    public LongFilter(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongPredicate predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void nextIteration() {
        while (iterator.hasNext()) {
            next = iterator.nextLong();
            if (predicate.test(next)) {
                hasNext = true;
                return;
            }
        }
        hasNext = false;
    }
}
