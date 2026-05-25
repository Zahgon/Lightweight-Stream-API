package com.annimon.stream.operator;

import com.annimon.stream.Stream;
import com.annimon.stream.function.Function;
import com.annimon.stream.iterator.LsaExtIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjFlatMap<T, R> extends LsaExtIterator<R> {

    private final Iterator<? extends T> iterator;

    private final Function<? super T, ? extends Stream<? extends R>> mapper;

    private Iterator<? extends R> inner;

    private Stream<? extends R> innerStream;

    public ObjFlatMap(@NotNull Iterator<? extends T> iterator, @NotNull Function<? super T, ? extends Stream<? extends R>> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
