package com.annimon.stream.operator;

import com.annimon.stream.DoubleStream;
import com.annimon.stream.function.DoubleFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class DoubleFlatMap extends PrimitiveIterator.OfDouble {

    private final PrimitiveIterator.OfDouble iterator;

    private final DoubleFunction<? extends DoubleStream> mapper;

    private PrimitiveIterator.OfDouble inner;

    private DoubleStream innerStream;

    public DoubleFlatMap(@NotNull PrimitiveIterator.OfDouble iterator, @NotNull DoubleFunction<? extends DoubleStream> mapper) {
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
