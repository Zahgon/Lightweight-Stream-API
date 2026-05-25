package com.annimon.stream.operator;

import com.annimon.stream.LongStream;
import com.annimon.stream.function.LongFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class LongFlatMap extends PrimitiveIterator.OfLong {

    private final PrimitiveIterator.OfLong iterator;

    private final LongFunction<? extends LongStream> mapper;

    private PrimitiveIterator.OfLong inner;

    private LongStream innerStream;

    public LongFlatMap(@NotNull PrimitiveIterator.OfLong iterator, @NotNull LongFunction<? extends LongStream> mapper) {
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
