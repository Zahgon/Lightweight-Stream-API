package com.annimon.stream.operator;

import com.annimon.stream.function.Supplier;
import com.annimon.stream.iterator.LsaIterator;
import org.jetbrains.annotations.NotNull;

public class ObjGenerate<T> extends LsaIterator<T> {

    private final Supplier<T> supplier;

    public ObjGenerate(@NotNull Supplier<T> supplier) {
        this.supplier = supplier;
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
