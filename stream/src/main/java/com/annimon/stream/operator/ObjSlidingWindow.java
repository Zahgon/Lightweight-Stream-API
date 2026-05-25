package com.annimon.stream.operator;

import com.annimon.stream.internal.Compat;
import com.annimon.stream.iterator.LsaIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.jetbrains.annotations.NotNull;

public class ObjSlidingWindow<T> extends LsaIterator<List<T>> {

    private final Queue<T> queue;

    private final Iterator<? extends T> iterator;

    private final int windowSize;

    private final int stepWidth;

    public ObjSlidingWindow(@NotNull Iterator<? extends T> iterator, int windowSize, int stepWidth) {
        this.iterator = iterator;
        this.windowSize = windowSize;
        this.stepWidth = stepWidth;
        queue = Compat.queue();
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<T> nextIteration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
