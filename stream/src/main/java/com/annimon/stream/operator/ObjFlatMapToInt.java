package com.annimon.stream.operator;

import com.annimon.stream.IntStream;
import com.annimon.stream.function.Function;
import com.annimon.stream.iterator.PrimitiveExtIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class ObjFlatMapToInt<T> extends PrimitiveExtIterator.OfInt {

    private final Iterator<? extends T> iterator;

    private final Function<? super T, ? extends IntStream> mapper;

    private PrimitiveIterator.OfInt inner;

    public ObjFlatMapToInt(@NotNull Iterator<? extends T> iterator, @NotNull Function<? super T, ? extends IntStream> mapper) {
        this.iterator = iterator;
        this.mapper = mapper;
    }

    @Override
    protected void nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
