package com.annimon.stream.internal;

import com.annimon.stream.function.Consumer;
import com.annimon.stream.function.DoubleConsumer;
import com.annimon.stream.function.IntConsumer;
import com.annimon.stream.function.IntFunction;
import com.annimon.stream.function.LongConsumer;
import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Base class for a data structure for gathering elements into a buffer and then
 * iterating them. Maintains an array of increasingly sized arrays, so there is
 * no copying cost associated with growing the data structure.
 */
@SuppressWarnings({ "WeakerAccess", "SameParameterValue" })
public abstract class SpinedBuffer<E, T_ARR> implements Iterable<E> {

    /**
     * Minimum power-of-two for the first chunk.
     */
    static final int MIN_CHUNK_POWER = 4;

    /**
     * Minimum size for the first chunk.
     */
    static final int MIN_CHUNK_SIZE = 1 << MIN_CHUNK_POWER;

    /**
     * Max power-of-two for chunks.
     */
    private static final int MAX_CHUNK_POWER = 30;

    /**
     * Minimum array size for array-of-chunks.
     */
    private static final int MIN_SPINE_SIZE = 8;

    /**
     * log2 of the size of the first chunk.
     */
    final int initialChunkPower;

    /**
     * Index of the *next* element to write; may point into, or just outside of,
     * the current chunk.
     */
    int elementIndex;

    /**
     * Index of the *current* chunk in the spine array, if the spine array is
     * non-null.
     */
    int spineIndex;

    /**
     * Count of elements in all prior chunks.
     */
    long[] priorElementCount;

    T_ARR curChunk;

    T_ARR[] spine;

    SpinedBuffer() {
        this.initialChunkPower = MIN_CHUNK_POWER;
        curChunk = newArray(1 << initialChunkPower);
    }

    /**
     * Construct with a specified initial capacity.
     *
     * @param initialCapacity The minimum expected number of elements
     */
    SpinedBuffer(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.initialChunkPower = Math.max(MIN_CHUNK_POWER, Integer.SIZE - Integer.numberOfLeadingZeros(initialCapacity - 1));
        curChunk = newArray(1 << initialChunkPower);
    }

    @Override
    public abstract Iterator<E> iterator();

    protected abstract T_ARR[] newArrayArray(int size);

    protected abstract T_ARR newArray(int size);

    protected abstract int arrayLength(T_ARR array);

    /**
     * Is the buffer currently empty?
     * @return true, if buffer is empty
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * How many elements are currently in the buffer?
     * @return a number of elements in buffer
     */
    public long count() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * How big should the nth chunk be?
     */
    int chunkSize(int n) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    long capacity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void inflateSpine() {
        if (spine == null) {
            spine = newArrayArray(MIN_SPINE_SIZE);
            priorElementCount = new long[MIN_SPINE_SIZE];
            spine[0] = curChunk;
        }
    }

    final void ensureCapacity(long targetSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void increaseCapacity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int chunkFor(long index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("SuspiciousSystemArraycopy")
    void copyInto(T_ARR array, int offset) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void preAccept() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Remove all data from the buffer
     */
    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Of<E> extends SpinedBuffer<E, E[]> implements Consumer<E> {

        public Of() {
        }

        public Of(int initialCapacity) {
            super(initialCapacity);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected E[][] newArrayArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @SuppressWarnings("unchecked")
        @Override
        protected E[] newArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected int arrayLength(E[] array) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void accept(E e) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public E get(long index) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public Iterator<E> iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public E[] asArray(IntFunction<E[]> arrayFactory) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    abstract static class OfPrimitive<E, T_ARR> extends SpinedBuffer<E, T_ARR> {

        OfPrimitive() {
        }

        OfPrimitive(int initialCapacity) {
            super(initialCapacity);
        }

        public T_ARR asPrimitiveArray() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class OfInt extends SpinedBuffer.OfPrimitive<Integer, int[]> implements IntConsumer {

        public OfInt() {
        }

        public OfInt(int initialCapacity) {
            super(initialCapacity);
        }

        @Override
        protected int[][] newArrayArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public int[] newArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected int arrayLength(int[] array) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void accept(int i) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int get(long index) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public PrimitiveIterator.OfInt iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class OfLong extends SpinedBuffer.OfPrimitive<Long, long[]> implements LongConsumer {

        public OfLong() {
        }

        public OfLong(int initialCapacity) {
            super(initialCapacity);
        }

        @Override
        protected long[][] newArrayArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public long[] newArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected int arrayLength(long[] array) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void accept(long i) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public long get(long index) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public PrimitiveIterator.OfLong iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static class OfDouble extends SpinedBuffer.OfPrimitive<Double, double[]> implements DoubleConsumer {

        public OfDouble() {
        }

        public OfDouble(int initialCapacity) {
            super(initialCapacity);
        }

        @Override
        protected double[][] newArrayArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public double[] newArray(int size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected int arrayLength(double[] array) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public void accept(double i) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double get(long index) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public PrimitiveIterator.OfDouble iterator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
