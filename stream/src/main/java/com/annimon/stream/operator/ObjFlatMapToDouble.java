package com.annimon.stream.operator;

import com.annimon.stream.DoubleStream;
import com.annimon.stream.function.Function;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjFlatMapToDouble<T> extends PrimitiveExtIterator.OfDouble {

    private final Iterator<? extends T> iterator;

    private final Function<? super T, ? extends DoubleStream> mapper;

    private PrimitiveIterator.OfDouble inner;

    public ObjFlatMapToDouble(@NotNull Iterator<? extends T> iterator, @NotNull Function<? super T, ? extends DoubleStream> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
