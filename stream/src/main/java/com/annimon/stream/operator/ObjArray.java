package com.annimon.stream.operator;

import com.annimon.stream.iterator.LsaIterator;
import org.jetbrains.annotations.NotNull;

public class ObjArray<T> extends LsaIterator<T> {

    private final T[] elements;

    private int index;

    public ObjArray(@NotNull T[] elements) {
        this.elements = elements;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
