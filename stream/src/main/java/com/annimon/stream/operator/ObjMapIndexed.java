package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedFunction;
import com.annimon.stream.iterator.IndexedIterator;
import com.annimon.stream.iterator.LsaIterator;
import org.jetbrains.annotations.NotNull;

public class ObjMapIndexed<T, R> extends LsaIterator<R> {

    private final IndexedIterator<? extends T> iterator;

    private final IndexedFunction<? super T, ? extends R> mapper;

    public ObjMapIndexed(@NotNull IndexedIterator<? extends T> iterator, @NotNull IndexedFunction<? super T, ? extends R> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public R nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
