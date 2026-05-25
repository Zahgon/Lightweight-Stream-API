package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedPredicate;
import com.annimon.stream.iterator.IndexedIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class ObjTakeWhileIndexed<T> implements Iterator<T> {

    private final IndexedIterator<? extends T> iterator;

    private final IndexedPredicate<? super T> predicate;

    private T next;

    private boolean nextPresent;

    private boolean hasNextComputed, hasNext;

    public ObjTakeWhileIndexed(@NotNull IndexedIterator<? extends T> iterator, @NotNull IndexedPredicate<? super T> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean getNextAndTest() {
        int nextIndex = iterator.getIndex();
        next = iterator.next();
        hasNext = predicate.test(nextIndex, next);
        return hasNext;
    }
}
