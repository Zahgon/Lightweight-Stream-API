package com.annimon.stream.operator;

import com.annimon.stream.function.ToDoubleFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjMapToDouble<T> extends PrimitiveIterator.OfDouble {

    private final Iterator<? extends T> iterator;

    private final ToDoubleFunction<? super T> mapper;

    public ObjMapToDouble(@NotNull Iterator<? extends T> iterator, @NotNull ToDoubleFunction<? super T> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public double nextDouble() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
