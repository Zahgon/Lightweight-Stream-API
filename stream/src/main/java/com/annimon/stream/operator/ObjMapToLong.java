package com.annimon.stream.operator;

import com.annimon.stream.function.ToLongFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjMapToLong<T> extends PrimitiveIterator.OfLong {

    private final Iterator<? extends T> iterator;

    private final ToLongFunction<? super T> mapper;

    public ObjMapToLong(@NotNull Iterator<? extends T> iterator, @NotNull ToLongFunction<? super T> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public long nextLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
