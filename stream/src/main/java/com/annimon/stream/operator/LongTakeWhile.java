package com.annimon.stream.operator;

import com.annimon.stream.function.LongPredicate;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class LongTakeWhile extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongPredicate predicate;

    private long next;

    private boolean nextPresent;

    private boolean hasNextComputed, hasNext;

    public LongTakeWhile(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongPredicate predicate) {
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

    private boolean getNextAndTest() {
        next = iterator.nextLong();
        hasNext = predicate.test(next);
        return hasNext;
    }
}
