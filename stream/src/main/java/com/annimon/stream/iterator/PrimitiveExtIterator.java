package com.annimon.stream.iterator;

import java.util.NoSuchElementException;

/**
 * Extended PrimitiveIterator for common purposes.
 */
public final class PrimitiveExtIterator {

    private PrimitiveExtIterator() {
    }

    public static abstract class OfInt extends PrimitiveIterator.OfInt {

        protected int next;

        protected boolean hasNext, isInit;

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @SuppressWarnings("ResultOfMethodCallIgnored")
        @Override
        public int nextInt() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected abstract void nextIteration();
    }

    public static abstract class OfLong extends PrimitiveIterator.OfLong {

        protected long next;

        protected boolean hasNext, isInit;

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public long nextLong() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected abstract void nextIteration();
    }

    public static abstract class OfDouble extends PrimitiveIterator.OfDouble {

        protected double next;

        protected boolean hasNext, isInit;

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public double nextDouble() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected abstract void nextIteration();
    }
}
