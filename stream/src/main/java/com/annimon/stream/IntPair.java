package com.annimon.stream;

/**
 * A pair with int-valued first element and object-valued second element.
 *
 * @param <T> the type of the second element
 * @since 1.1.2
 */
public final class IntPair<T> {

    private final int first;

    private final T second;

    public IntPair(int first, T second) {
        this.first = first;
        this.second = second;
    }

    /**
     * A first element in a pair.
     *
     * @return a first element
     */
    public int getFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * A second element in a pair.
     *
     * @return a second element
     */
    public T getSecond() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
