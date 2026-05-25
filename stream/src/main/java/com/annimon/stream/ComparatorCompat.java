package com.annimon.stream;

import com.annimon.stream.function.Function;
import com.annimon.stream.function.ToDoubleFunction;
import com.annimon.stream.function.ToIntFunction;
import com.annimon.stream.function.ToLongFunction;
import java.util.Collections;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Backported default and static methods from Java 8 {@link java.util.Comparator} interface.
 *
 * @since 1.1.6
 */
@SuppressWarnings("WeakerAccess")
public final class ComparatorCompat<T> implements Comparator<T> {

    private static final ComparatorCompat<Comparable<Object>> NATURAL_ORDER = new ComparatorCompat<Comparable<Object>>(new Comparator<Comparable<Object>>() {

        @Override
        public int compare(@NotNull Comparable<Object> o1, @NotNull Comparable<Object> o2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    });

    private static final ComparatorCompat<Comparable<Object>> REVERSE_ORDER = new ComparatorCompat<Comparable<Object>>(Collections.reverseOrder());

    /**
     * Returns a comparator with natural order.
     *
     * @param <T> the type of the objects compared by the comparator
     * @return a comparator
     */
    @NotNull
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<? super T>> ComparatorCompat<T> naturalOrder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator with reverse order.
     *
     * @param <T> the type of the objects compared by the comparator
     * @return a comparator
     * @see Collections#reverseOrder()
     */
    @NotNull
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<? super T>> ComparatorCompat<T> reverseOrder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that reverses the order of the specified comparator.
     * If the specified comparator is {@code null}, this method is equivalent
     * to {@link #reverseOrder()}.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param comparator  a comparator to be reversed
     * @return a comparator
     * @see Collections#reverseOrder(java.util.Comparator)
     * @throws NullPointerException if {@code comparator} is null
     */
    @NotNull
    public static <T> Comparator<T> reversed(@Nullable Comparator<T> comparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses {@code c2} comparator
     * if {@code c1} comparator considers two elements equal.
     *
     * @param <T> the type of the objects compared by the comparators
     * @param c1  a first comparator
     * @param c2  a second comparator
     * @return a comparator
     * @throws NullPointerException if {@code c1} or {@code c2} is null
     */
    @NotNull
    public static <T> Comparator<T> thenComparing(@NotNull final Comparator<? super T> c1, @NotNull final Comparator<? super T> c2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses a function that extracts a sort key
     * to be compared with the specified comparator.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param <U> the type of the sort key
     * @param keyExtractor  the function that extracts the sort key
     * @param keyComparator  the comparator used to compare the sort key
     * @return a comparator
     * @throws NullPointerException if {@code keyExtractor} or {@code keyComparator} is null
     */
    @NotNull
    public static <T, U> ComparatorCompat<T> comparing(@NotNull final Function<? super T, ? extends U> keyExtractor, @NotNull final Comparator<? super U> keyComparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses a function that extracts
     * a {@link java.lang.Comparable} sort key to be compared.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param <U> the type of the sort key
     * @param keyExtractor  the function that extracts the sort key
     * @return a comparator
     * @throws NullPointerException if {@code keyExtractor} is null
     */
    @NotNull
    public static <T, U extends Comparable<? super U>> ComparatorCompat<T> comparing(@NotNull final Function<? super T, ? extends U> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses a function that extracts
     * an {@code int} sort key to be compared.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param keyExtractor  the function that extracts the sort key
     * @return a comparator
     * @throws NullPointerException if {@code keyExtractor} is null
     */
    @NotNull
    public static <T> ComparatorCompat<T> comparingInt(@NotNull final ToIntFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses a function that extracts
     * a {@code long} sort key to be compared.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param keyExtractor  the function that extracts the sort key
     * @return a comparator
     * @throws NullPointerException if {@code keyExtractor} is null
     */
    @NotNull
    public static <T> ComparatorCompat<T> comparingLong(@NotNull final ToLongFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that uses a function that extracts
     * a {@code double} sort key to be compared.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param keyExtractor  the function that extracts the sort key
     * @return a comparator
     * @throws NullPointerException if {@code keyExtractor} is null
     */
    @NotNull
    public static <T> ComparatorCompat<T> comparingDouble(@NotNull final ToDoubleFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that considers {@code null} to be
     * less than non-null and all non-null values to be equal.
     *
     * @param <T> the type of the objects compared by the comparator
     * @return a comparator
     */
    @NotNull
    public static <T> ComparatorCompat<T> nullsFirst() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that considers {@code null} to be less than non-null.
     * If the specified comparator is {@code null}, then the returned
     * comparator considers all non-null values to be equal.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param comparator  a comparator for comparing non-null values
     * @return a comparator
     */
    @NotNull
    public static <T> ComparatorCompat<T> nullsFirst(@Nullable Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that considers {@code null} to be
     * greater than non-null and all non-null values to be equal.
     *
     * @param <T> the type of the objects compared by the comparator
     * @return a comparator
     */
    @NotNull
    public static <T> ComparatorCompat<T> nullsLast() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a comparator that considers {@code null} to be greater than non-null.
     * If the specified comparator is {@code null}, then the returned
     * comparator considers all non-null values to be equal.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param comparator  a comparator for comparing non-null values
     * @return a comparator
     */
    @NotNull
    public static <T> ComparatorCompat<T> nullsLast(@Nullable Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> ComparatorCompat<T> nullsComparator(final boolean nullFirst, @Nullable final Comparator<? super T> comparator) {
        return new ComparatorCompat<T>(new Comparator<T>() {

            @Override
            public int compare(@Nullable T t1, @Nullable T t2) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }

    /**
     * Allows to build comparators with method chaining.
     *
     * @param <T> the type of the objects compared by the comparator
     * @param comparator  the comparator to be chained
     * @return a {@code ComparatorCompat} instance
     */
    @NotNull
    public static <T> ComparatorCompat<T> chain(@NotNull Comparator<T> comparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    private final Comparator<? super T> comparator;

    public ComparatorCompat(@NotNull Comparator<? super T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Reverses the order of comparator.
     *
     * @return the new {@code ComparatorCompat} instance
     * @see ComparatorCompat#reverseOrder()
     */
    @NotNull
    public ComparatorCompat<T> reversed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the given comparator to the chain.
     *
     * @param other  the other comparator to be used when chained
     *               comparator compares two objects that are equal
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public ComparatorCompat<T> thenComparing(@NotNull final Comparator<? super T> other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the comparator, that uses a function for extract
     * a sort key, to the chain.
     *
     * @param <U> the type of the sort key
     * @param keyExtractor  the function that extracts the sort key
     * @param keyComparator  the comparator used to compare the sort key
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public <U> ComparatorCompat<T> thenComparing(@NotNull Function<? super T, ? extends U> keyExtractor, @NotNull Comparator<? super U> keyComparator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the comparator, that uses a function for extract
     * a {@link java.lang.Comparable} sort key, to the chain.
     *
     * @param <U> the type of the sort key
     * @param keyExtractor  the function that extracts the sort key
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public <U extends Comparable<? super U>> ComparatorCompat<T> thenComparing(@NotNull Function<? super T, ? extends U> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the comparator, that uses a function for extract
     * an {@code int} sort key, to the chain.
     *
     * @param keyExtractor  the function that extracts the sort key
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public ComparatorCompat<T> thenComparingInt(@NotNull ToIntFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the comparator, that uses a function for extract
     * a {@code long} sort key, to the chain.
     *
     * @param keyExtractor  the function that extracts the sort key
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public ComparatorCompat<T> thenComparingLong(@NotNull ToLongFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the comparator, that uses a function for extract
     * a {@code double} sort key, to the chain.
     *
     * @param keyExtractor  the function that extracts the sort key
     * @return the new {@code ComparatorCompat} instance
     */
    @NotNull
    public ComparatorCompat<T> thenComparingDouble(@NotNull ToDoubleFunction<? super T> keyExtractor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a chained {@code Comparator}.
     *
     * @deprecated  As of release 1.1.7, it is unnecessary to call this method.
     * @return a comparator
     */
    @NotNull
    @SuppressWarnings("unchecked")
    public Comparator<T> comparator() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int compare(T o1, T o2) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
