package com.annimon.stream.operator;

import com.annimon.stream.function.IntSupplier;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class IntGenerate extends PrimitiveIterator.OfInt {

    private final IntSupplier supplier;

    public IntGenerate(@NotNull IntSupplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
