package com.annimon.stream.operator;

import com.annimon.stream.function.Consumer;
import com.annimon.stream.iterator.LsaIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjPeek<T> extends LsaIterator<T> {

    private final Iterator<? extends T> iterator;

    private final Consumer<? super T> action;

    public ObjPeek(@NotNull Iterator<? extends T> iterator, @NotNull Consumer<? super T> action) {
        this.iterator = iterator;
        this.action = action;
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
