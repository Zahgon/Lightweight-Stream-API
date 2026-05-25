package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedPredicate;
import com.annimon.stream.iterator.IndexedIterator;
import com.annimon.stream.iterator.LsaExtIterator;
import org.jetbrains.annotations.NotNull;

public class ObjDropWhileIndexed<T> extends LsaExtIterator<T> {

    private final IndexedIterator<? extends T> iterator;

    private final IndexedPredicate<? super T> predicate;

    public ObjDropWhileIndexed(@NotNull IndexedIterator<? extends T> iterator, @NotNull IndexedPredicate<? super T> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
