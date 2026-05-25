package com.annimon.stream.internal;

import com.annimon.stream.function.IntFunction;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class Operators {

    private Operators() {
    }

    @NotNull
    public static <T> List<T> toList(@NotNull Iterator<? extends T> iterator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @SuppressWarnings("unchecked")
    public static <T, R> R[] toArray(@NotNull Iterator<? extends T> iterator, @NotNull IntFunction<R[]> generator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static int[] toIntArray(@NotNull PrimitiveIterator.OfInt iterator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static long[] toLongArray(@NotNull PrimitiveIterator.OfLong iterator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static double[] toDoubleArray(@NotNull PrimitiveIterator.OfDouble iterator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
