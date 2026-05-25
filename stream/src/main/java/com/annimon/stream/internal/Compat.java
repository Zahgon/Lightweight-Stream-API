package com.annimon.stream.internal;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

/**
 * Compatibility methods for Android API &lt; 9.
 */
@SuppressWarnings("WeakerAccess")
public final class Compat {

    static final long MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    private static final String BAD_SIZE = "Stream size exceeds max array size";

    @NotNull
    public static <T> Queue<T> queue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <E> E[] newArray(int length, E... array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <E> E[] newArrayCompat(E[] array, int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void checkMaxArraySize(long size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
