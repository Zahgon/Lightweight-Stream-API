package com.annimon.stream.operator;

import com.annimon.stream.function.LongSupplier;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class LongGenerate extends PrimitiveIterator.OfLong {

    private final LongSupplier supplier;

    public LongGenerate(@NotNull LongSupplier supplier) {
        this.supplier = supplier;
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
