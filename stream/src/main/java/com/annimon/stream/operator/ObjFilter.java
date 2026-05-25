package com.annimon.stream.operator;

import com.annimon.stream.function.Predicate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class ObjFilter<T> implements Iterator<T> {

    private final Iterator<? extends T> iterator;

    private final Predicate<? super T> predicate;

    private boolean hasNext, hasNextEvaluated;

    private T next;

    public ObjFilter(@NotNull Iterator<? extends T> iterator, @NotNull Predicate<? super T> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void nextIteration() {
        while (iterator.hasNext()) {
            next = iterator.next();
            if (predicate.test(next)) {
                hasNext = true;
                return;
            }
        }
        hasNext = false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
