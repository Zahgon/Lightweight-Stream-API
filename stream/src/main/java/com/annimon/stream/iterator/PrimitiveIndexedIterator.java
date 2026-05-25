package com.annimon.stream.iterator;

/**
 * PrimitiveIterator wrapper that supports indexing.
 *
 * @since 1.2.1
 */
public final class PrimitiveIndexedIterator {

    private PrimitiveIndexedIterator() {
    }

    public static class OfInt extends PrimitiveIterator.OfInt {

        private final PrimitiveIterator.OfInt iterator;

        private final int step;

        private int index;

        public OfInt(PrimitiveIterator.OfInt iterator) {
            this(0, 1, iterator);
        }

        public OfInt(int start, int step, PrimitiveIterator.OfInt iterator) {
            this.iterator = iterator;
            this.step = step;
            index = start;
        }

        public int getIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
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

    public static class OfLong extends PrimitiveIterator.OfLong {

        private final PrimitiveIterator.OfLong iterator;

        private final int step;

        private int index;

        public OfLong(PrimitiveIterator.OfLong iterator) {
            this(0, 1, iterator);
        }

        public OfLong(int start, int step, PrimitiveIterator.OfLong iterator) {
            this.iterator = iterator;
            this.step = step;
            index = start;
        }

        public int getIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
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

    public static class OfDouble extends PrimitiveIterator.OfDouble {

        private final PrimitiveIterator.OfDouble iterator;

        private final int step;

        private int index;

        public OfDouble(PrimitiveIterator.OfDouble iterator) {
            this(0, 1, iterator);
        }

        public OfDouble(int start, int step, PrimitiveIterator.OfDouble iterator) {
            this.iterator = iterator;
            this.step = step;
            index = start;
        }

        public int getIndex() {
            throw new UnsupportedOperationException("STUB: not implemented");
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
}
