package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedPredicate;
import com.annimon.stream.iterator.IndexedIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class ObjFilterIndexed<T> implements Iterator<T> {

    private final IndexedIterator<? extends T> iterator;

    private final IndexedPredicate<? super T> predicate;

    private boolean hasNext, hasNextEvaluated;

    private T next;

    public ObjFilterIndexed(@NotNull IndexedIterator<? extends T> iterator, @NotNull IndexedPredicate<? super T> predicate) {
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
            final int index = iterator.getIndex();
            next = iterator.next();
            if (predicate.test(index, next)) {
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
