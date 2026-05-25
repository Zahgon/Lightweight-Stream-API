package com.annimon.stream.operator;

import com.annimon.stream.function.Function;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjMap<T, R> implements Iterator<R> {

    private final Iterator<? extends T> iterator;

    private final Function<? super T, ? extends R> mapper;

    public ObjMap(@NotNull Iterator<? extends T> iterator, @NotNull Function<? super T, ? extends R> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
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
    public R next() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
