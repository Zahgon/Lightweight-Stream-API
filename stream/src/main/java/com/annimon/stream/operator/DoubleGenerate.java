package com.annimon.stream.operator;

import com.annimon.stream.function.DoubleSupplier;
import com.annimon.stream.iterator.PrimitiveIterator;
import org.jetbrains.annotations.NotNull;

public class DoubleGenerate extends PrimitiveIterator.OfDouble {

    private final DoubleSupplier supplier;

    public DoubleGenerate(@NotNull DoubleSupplier supplier) {
        this.supplier = supplier;
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
