package com.annimon.stream.operator;

import com.annimon.stream.function.IndexedLongUnaryOperator;
import com.annimon.stream.iterator.PrimitiveIndexedIterator;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongMapIndexed extends PrimitiveIterator.OfLong {

    private final PrimitiveIndexedIterator.OfLong iterator;

    private final IndexedLongUnaryOperator mapper;

    public LongMapIndexed(@NotNull PrimitiveIndexedIterator.OfLong iterator, @NotNull IndexedLongUnaryOperator mapper) {
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
