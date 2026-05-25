package com.annimon.stream.iterator;

import java.util.Iterator;

/**
 * A base type for primitive specializations of {@link Iterator}.
 * Specialized subtypes are provided for {@link OfInt int},
 * {@link OfLong long} and {@link OfDouble double} values.
 */
public final class PrimitiveIterator {

    private PrimitiveIterator() {
    }

    public abstract static class OfInt implements Iterator<Integer> {

        public abstract int nextInt();

        @Override
        public Integer next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public abstract static class OfLong implements Iterator<Long> {

        public abstract long nextLong();

        @Override
        public Long next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public abstract static class OfDouble implements Iterator<Double> {

        public abstract double nextDouble();

        @Override
        public Double next() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
