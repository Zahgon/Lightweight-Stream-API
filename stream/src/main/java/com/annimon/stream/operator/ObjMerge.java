package com.annimon.stream.operator;

import com.annimon.stream.function.BiFunction;
import com.annimon.stream.iterator.LsaIterator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

public class ObjMerge<T> extends LsaIterator<T> {

    public enum MergeResult {

        TAKE_FIRST, TAKE_SECOND
    }

    private final Iterator<? extends T> iterator1;

    private final Iterator<? extends T> iterator2;

    private final BiFunction<? super T, ? super T, MergeResult> selector;

    private final Queue<T> buffer1;

    private final Queue<T> buffer2;

    public ObjMerge(@NotNull Iterator<? extends T> iterator1, @NotNull Iterator<? extends T> iterator2, @NotNull BiFunction<? super T, ? super T, MergeResult> selector) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        this.selector = selector;
        buffer1 = new LinkedList<T>();
        buffer2 = new LinkedList<T>();
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private T select(T v1, T v2) {
        final MergeResult result = selector.apply(v1, v2);
        switch(result) {
            case TAKE_FIRST:
                buffer2.add(v2);
                return v1;
            case TAKE_SECOND:
            default:
                buffer1.add(v1);
                return v2;
        }
    }
}
