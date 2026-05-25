package com.annimon.stream.operator;

import com.annimon.stream.function.Predicate;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class ObjTakeWhile<T> implements Iterator<T> {

    private final Iterator<? extends T> iterator;

    private final Predicate<? super T> predicate;

    private T next;

    private boolean nextPresent;

    private boolean hasNextComputed, hasNext;

    public ObjTakeWhile(@NotNull Iterator<? extends T> iterator, @NotNull Predicate<? super T> predicate) {
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
        next = iterator.next();
        hasNext = predicate.test(next);
        return hasNext;
    }
}
