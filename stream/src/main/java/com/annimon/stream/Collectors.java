package com.annimon.stream;

import com.annimon.stream.function.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Common implementations of {@code Collector} interface.
 *
 * @see Collector
 */
@SuppressWarnings({ "WeakerAccess", "unused", "RedundantTypeArguments" })
public final class Collectors {

    private static final Supplier<long[]> LONG_2ELEMENTS_ARRAY_SUPPLIER = new Supplier<long[]>() {

        @Override
        public long[] get() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    private static final Supplier<double[]> DOUBLE_2ELEMENTS_ARRAY_SUPPLIER = new Supplier<double[]>() {

        @Override
        public double[] get() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    private Collectors() {
    }

    /**
     * Returns a {@code Collector} that fills new {@code Collection}, provided by {@code collectionSupplier},
     * with input elements.
     *
     * @param <T> the type of the input elements
     * @param <R> the type of the resulting collection
     * @param collectionSupplier  a supplier function that provides new collection
     * @return a {@code Collector}
     */
    @NotNull
    public static <T, R extends Collection<T>> Collector<T, ?, R> toCollection(@NotNull Supplier<R> collectionSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code List} with input elements.
     *
     * @param <T> the type of the input elements
     * @return a {@code Collector}
     */
    @NotNull
    public static <T> Collector<T, ?, List<T>> toList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new unmodifiable {@code List} with input elements.
     *
     * The returned {@code Collector} disallows {@code null}s
     * and throws {@code NullPointerException} if it is presented with a null value.
     *
     * @param <T> the type of the input elements
     * @return a {@code Collector}
     * @since 1.2.0
     */
    @NotNull
    public static <T> Collector<T, ?, List<T>> toUnmodifiableList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Set} with input elements.
     *
     * @param <T> the type of the input elements
     * @return a {@code Collector}
     */
    @NotNull
    public static <T> Collector<T, ?, Set<T>> toSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new unmodifiable {@code Set} with input elements.
     *
     * The returned {@code Collector} disallows {@code null}s
     * and throws {@code NullPointerException} if it is presented with a null value.
     * If elements contain duplicates, an arbitrary element of the duplicates is preserved.
     *
     * @param <T> the type of the input elements
     * @return a {@code Collector}
     * @since 1.2.0
     */
    @NotNull
    public static <T> Collector<T, ?, Set<T>> toUnmodifiableSet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Map} with input elements.
     *
     * If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
     * Use {@link #toMap(Function, Function, BinaryOperator)} to handle merging of the values.
     *
     * @param <T> the type of the input elements and the result type of value mapping function
     * @param <K> the result type of key mapping function
     * @param keyMapper  a mapping function to produce keys
     * @return a {@code Collector}
     * @since 1.1.3
     * @see #toMap(Function, Function, BinaryOperator)
     */
    @NotNull
    public static <T, K> Collector<T, ?, Map<K, T>> toMap(@NotNull final Function<? super T, ? extends K> keyMapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Map} with input elements.
     *
     * If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
     * Use {@link #toMap(Function, Function, BinaryOperator)} to handle merging of the values.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @return a {@code Collector}
     * @see #toMap(Function, Function, BinaryOperator)
     */
    @NotNull
    public static <T, K, V> Collector<T, ?, Map<K, V>> toMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Map} with input elements.
     *
     * If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown.
     * Use {@link #toMap(Function, Function, BinaryOperator, Supplier)} to handle merging of the values.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param <M> the type of the resulting {@code Map}
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @param mapFactory  a supplier function that provides new {@code Map}
     * @return a {@code Collector}
     * @see #toMap(Function, Function, BinaryOperator, Supplier)
     */
    @NotNull
    public static <T, K, V, M extends Map<K, V>> Collector<T, ?, M> toMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper, @NotNull final Supplier<M> mapFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new unmodifiable {@code Map} with input elements.
     *
     * The returned {@code Collector} disallows {@code null} keys and values.
     * If the mapped keys contain duplicates, an {@code IllegalStateException} is thrown,
     * see {@link #toUnmodifiableMap(Function, Function, BinaryOperator)}.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @return a {@code Collector}
     * @see #toUnmodifiableMap(Function, Function, BinaryOperator)
     * @since 1.2.0
     */
    @NotNull
    public static <T, K, V> Collector<T, ?, Map<K, V>> toUnmodifiableMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Map} with input elements.
     *
     * If the mapped keys contain duplicates, the value mapping function is applied
     * to each equal element, and the results are merged using the provided merging function.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @param mergeFunction  a merge function, used to resolve collisions between
     *                       values associated with the same key
     * @return a {@code Collector}
     * @since 1.2.0
     */
    @NotNull
    public static <T, K, V> Collector<T, ?, Map<K, V>> toMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper, @NotNull final BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new {@code Map} with input elements.
     *
     * If the mapped keys contain duplicates, the value mapping function is applied
     * to each equal element, and the results are merged using the provided merging function.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param <M> the type of the resulting {@code Map}
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @param mergeFunction  a merge function, used to resolve collisions between
     *                       values associated with the same key
     * @param mapFactory  a supplier function that provides new {@code Map}
     * @return a {@code Collector}
     * @since 1.2.0
     */
    @NotNull
    public static <T, K, V, M extends Map<K, V>> Collector<T, ?, M> toMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper, @NotNull final BinaryOperator<V> mergeFunction, @NotNull final Supplier<M> mapFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that fills new unmodifiable {@code Map} with input elements.
     *
     * The returned {@code Collector} disallows {@code null} keys and values.
     *
     * @param <T> the type of the input elements
     * @param <K> the result type of key mapping function
     * @param <V> the result type of value mapping function
     * @param keyMapper  a mapping function to produce keys
     * @param valueMapper  a mapping function to produce values
     * @param mergeFunction  a merge function, used to resolve collisions between
     *                       values associated with the same key
     * @return a {@code Collector}
     * @since 1.2.0
     */
    @NotNull
    public static <T, K, V> Collector<T, ?, Map<K, V>> toUnmodifiableMap(@NotNull final Function<? super T, ? extends K> keyMapper, @NotNull final Function<? super T, ? extends V> valueMapper, @NotNull final BinaryOperator<V> mergeFunction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that concatenates input elements into new string.
     *
     * @return a {@code Collector}
     */
    @NotNull
    public static Collector<CharSequence, ?, String> joining() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that concatenates input elements into new string.
     *
     * @param delimiter  the delimiter between each element
     * @return a {@code Collector}
     */
    @NotNull
    public static Collector<CharSequence, ?, String> joining(@NotNull CharSequence delimiter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that concatenates input elements into new string.
     *
     * @param delimiter  the delimiter between each element
     * @param prefix  the prefix of result
     * @param suffix  the suffix of result
     * @return a {@code Collector}
     */
    @NotNull
    public static Collector<CharSequence, ?, String> joining(@NotNull CharSequence delimiter, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that concatenates input elements into new string.
     *
     * @param delimiter  the delimiter between each element
     * @param prefix  the prefix of result
     * @param suffix  the suffix of result
     * @param emptyValue  the string which replaces empty element if exists
     * @return a {@code Collector}
     */
    @NotNull
    public static Collector<CharSequence, ?, String> joining(@NotNull final CharSequence delimiter, @NotNull final CharSequence prefix, @NotNull final CharSequence suffix, @NotNull final String emptyValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that calculates average of input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @deprecated  As of release 1.1.3, replaced by
     *              {@link #averagingDouble(com.annimon.stream.function.ToDoubleFunction)}
     * @return a {@code Collector}
     */
    @Deprecated
    @NotNull
    public static <T> Collector<T, ?, Double> averaging(@NotNull final Function<? super T, Double> mapper) {
        return averagingDouble(new ToDoubleFunction<T>() {

            @Override
            public double applyAsDouble(T t) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }

    /**
     * Returns a {@code Collector} that calculates average of integer-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Double> averagingInt(@NotNull final ToIntFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that calculates average of long-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Double> averagingLong(@NotNull final ToLongFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    private static <T> Collector<T, ?, Double> averagingHelper(@NotNull final BiConsumer<long[], T> accumulator) {
        return new CollectorsImpl<T, long[], Double>(LONG_2ELEMENTS_ARRAY_SUPPLIER, accumulator, new Function<long[], Double>() {

            @NotNull
            @Override
            public Double apply(long[] t) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }

    /**
     * Returns a {@code Collector} that calculates average of double-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Double> averagingDouble(@NotNull final ToDoubleFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that summing integer-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Integer> summingInt(@NotNull final ToIntFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that summing long-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Long> summingLong(@NotNull final ToLongFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that summing double-valued input elements.
     *
     * @param <T> the type of the input elements
     * @param mapper  the mapping function which extracts value from element to calculate result
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T> Collector<T, ?, Double> summingDouble(@NotNull final ToDoubleFunction<? super T> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that counts the number of input elements.
     *
     * @param <T> the type of the input elements
     * @return a {@code Collector}
     */
    @NotNull
    public static <T> Collector<T, ?, Long> counting() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that reduces input elements.
     *
     * @param <T> the type of the input elements
     * @param identity  the initial value
     * @param op  the operator to reduce elements
     * @return a {@code Collector}
     * @see #reducing(java.lang.Object, com.annimon.stream.function.Function, com.annimon.stream.function.BinaryOperator)
     */
    @NotNull
    public static <T> Collector<T, ?, T> reducing(@Nullable final T identity, @NotNull final BinaryOperator<T> op) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that reduces input elements.
     *
     * @param <T> the type of the input elements
     * @param <R> the type of the output elements
     * @param identity  the initial value
     * @param mapper  the mapping function
     * @param op  the operator to reduce elements
     * @return a {@code Collector}
     * @see #reducing(java.lang.Object, com.annimon.stream.function.BinaryOperator)
     */
    @NotNull
    public static <T, R> Collector<T, ?, R> reducing(@Nullable final R identity, @NotNull final Function<? super T, ? extends R> mapper, @NotNull final BinaryOperator<R> op) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that filters input elements.
     *
     * @param <T> the type of the input elements
     * @param <A> the accumulation type
     * @param <R> the type of the output elements
     * @param predicate  a predicate used to filter elements
     * @param downstream  the collector of filtered elements
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T, A, R> Collector<T, ?, R> filtering(@NotNull final Predicate<? super T> predicate, @NotNull final Collector<? super T, A, R> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs mapping before accumulation.
     *
     * @param <T> the type of the input elements
     * @param <U> the result type of mapping function
     * @param <A> the accumulation type
     * @param <R> the result type of collector
     * @param mapper  a function that performs mapping to input elements
     * @param downstream  the collector of mapped elements
     * @return a {@code Collector}
     */
    @NotNull
    public static <T, U, A, R> Collector<T, ?, R> mapping(@NotNull final Function<? super T, ? extends U> mapper, @NotNull final Collector<? super U, A, R> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs flat-mapping before accumulation.
     *
     * @param <T> the type of the input elements
     * @param <U> the result type of flat-mapping function
     * @param <A> the accumulation type
     * @param <R> the result type of collector
     * @param mapper  a function that performs flat-mapping to input elements
     * @param downstream  the collector of flat-mapped elements
     * @return a {@code Collector}
     * @since 1.1.3
     */
    @NotNull
    public static <T, U, A, R> Collector<T, ?, R> flatMapping(@NotNull final Function<? super T, ? extends Stream<? extends U>> mapper, @NotNull final Collector<? super U, A, R> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs additional transformation.
     *
     * @param <T> the type of the input elements
     * @param <A> the accumulation type
     * @param <IR> the input type of the transformation function
     * @param <OR> the output type of the transformation function
     * @param c  the input {@code Collector}
     * @param finisher  the final transformation function
     * @return a {@code Collector}
     */
    @NotNull
    public static <T, A, IR, OR> Collector<T, A, OR> collectingAndThen(@NotNull Collector<T, A, IR> c, @NotNull Function<IR, OR> finisher) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs grouping operation by given classifier.
     *
     * @param <T> the type of the input elements
     * @param <K> the type of the keys
     * @param classifier  the classifier function
     * @return a {@code Collector}
     * @see #groupingBy(com.annimon.stream.function.Function, com.annimon.stream.Collector)
     * @see #groupingBy(com.annimon.stream.function.Function, com.annimon.stream.function.Supplier, com.annimon.stream.Collector)
     */
    @NotNull
    public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(@NotNull Function<? super T, ? extends K> classifier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs grouping operation by given classifier.
     *
     * @param <T> the type of the input elements
     * @param <K> the type of the keys
     * @param <A> the accumulation type
     * @param <D> the result type of downstream reduction
     * @param classifier  the classifier function
     * @param downstream  the collector of mapped elements
     * @return a {@code Collector}
     * @see #groupingBy(com.annimon.stream.function.Function)
     * @see #groupingBy(com.annimon.stream.function.Function, com.annimon.stream.function.Supplier, com.annimon.stream.Collector)
     */
    @NotNull
    public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(@NotNull Function<? super T, ? extends K> classifier, @NotNull Collector<? super T, A, D> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs grouping operation by given classifier.
     *
     * @param <T> the type of the input elements
     * @param <K> the type of the keys
     * @param <A> the accumulation type
     * @param <D> the result type of downstream reduction
     * @param <M> the type of the resulting {@code Map}
     * @param classifier  the classifier function
     * @param mapFactory  a supplier function that provides new {@code Map}
     * @param downstream  the collector of mapped elements
     * @return a {@code Collector}
     * @see #groupingBy(com.annimon.stream.function.Function)
     * @see #groupingBy(com.annimon.stream.function.Function, com.annimon.stream.Collector)
     */
    @NotNull
    public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(@NotNull final Function<? super T, ? extends K> classifier, @NotNull final Supplier<M> mapFactory, @NotNull final Collector<? super T, A, D> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs partitioning operation according to a predicate.
     * The returned {@code Map} always contains mappings for both {@code false} and {@code true} keys.
     *
     * @param <T> the type of the input elements
     * @param predicate  a predicate used for classifying input elements
     * @return a {@code Collector}
     * @since 1.1.9
     */
    @NotNull
    public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(@NotNull Predicate<? super T> predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that performs partitioning operation according to a predicate.
     * The returned {@code Map} always contains mappings for both {@code false} and {@code true} keys.
     *
     * @param <T> the type of the input elements
     * @param <D> the result type of downstream reduction
     * @param <A> the accumulation type
     * @param predicate  a predicate used for classifying input elements
     * @param downstream  the collector of partitioned elements
     * @return a {@code Collector}
     * @since 1.1.9
     */
    @NotNull
    public static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(@NotNull final Predicate<? super T> predicate, @NotNull final Collector<? super T, A, D> downstream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@code Collector} that composites two collectors.
     * Each element is processed by two specified collectors,
     * then their results are merged using the merge function into the final result.
     *
     * @param <T> the type of the input elements
     * @param <R1> the result type of the first collector
     * @param <R2> the result type of the second collector
     * @param <R> the type of the final result
     * @param downstream1  the first collector
     * @param downstream2  the second collector
     * @param merger  the function which merges two results into the single one
     * @return a {@code Collector}
     * @since 1.2.2
     */
    @NotNull
    public static <T, R1, R2, R> Collector<T, ?, R> teeing(@NotNull final Collector<? super T, ?, R1> downstream1, @NotNull final Collector<? super T, ?, R2> downstream2, @NotNull final BiFunction<? super R1, ? super R2, R> merger) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T, A1, A2, R1, R2, R> Collector<T, ?, R> teeingImpl(@NotNull final Collector<? super T, A1, R1> downstream1, @NotNull final Collector<? super T, A2, R2> downstream2, @NotNull final BiFunction<? super R1, ? super R2, R> merger) {
        Objects.requireNonNull(downstream1, "downstream1");
        Objects.requireNonNull(downstream2, "downstream2");
        Objects.requireNonNull(merger, "merger");
        final Supplier<A1> supplier1 = Objects.requireNonNull(downstream1.supplier(), "downstream1 supplier");
        final Supplier<A2> supplier2 = Objects.requireNonNull(downstream2.supplier(), "downstream2 supplier");
        final BiConsumer<A1, ? super T> acc1 = Objects.requireNonNull(downstream1.accumulator(), "downstream1 accumulator");
        final BiConsumer<A2, ? super T> acc2 = Objects.requireNonNull(downstream2.accumulator(), "downstream2 accumulator");
        final Function<A1, R1> finisher1 = Objects.requireNonNull(downstream1.finisher(), "downstream1 finisher");
        final Function<A2, R2> finisher2 = Objects.requireNonNull(downstream2.finisher(), "downstream2 finisher");
        return new CollectorsImpl<T, Map.Entry<A1, A2>, R>(new Supplier<Map.Entry<A1, A2>>() {

            @NotNull
            @Override
            public Map.Entry<A1, A2> get() {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        }, new BiConsumer<Map.Entry<A1, A2>, T>() {

            @Override
            public void accept(@NotNull Map.Entry<A1, A2> entry, T t) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        }, new Function<Map.Entry<A1, A2>, R>() {

            @NotNull
            @Override
            public R apply(@NotNull Map.Entry<A1, A2> entry) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        });
    }

    @NotNull
    private static <K, V> Supplier<Map<K, V>> hashMapSupplier() {
        return new Supplier<Map<K, V>>() {

            @NotNull
            @Override
            public Map<K, V> get() {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    @NotNull
    private static IllegalStateException duplicateKeyException(Object key, Object old, Object value) {
        return new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, old, value));
    }

    private static <K, V> void mapMerge(@NotNull Map<K, V> map, K key, V value, @NotNull BinaryOperator<V> merger) {
        final V oldValue = map.get(key);
        final V newValue;
        if (oldValue == null) {
            newValue = value;
        } else {
            newValue = merger.apply(oldValue, value);
        }
        if (newValue == null) {
            map.remove(key);
        } else {
            map.put(key, newValue);
        }
    }

    @NotNull
    private static <K, V> UnaryOperator<Map<K, V>> toUnmodifiableMapConverter() {
        return new UnaryOperator<Map<K, V>>() {

            @NotNull
            @Override
            public Map<K, V> apply(@NotNull Map<K, V> map) {
                throw new UnsupportedOperationException("STUB: not implemented");
            }
        };
    }

    @NotNull
    @SuppressWarnings("unchecked")
    static <A, R> Function<A, R> castIdentity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static final class Tuple1<A> {

        A a;

        Tuple1(A a) {
            this.a = a;
        }
    }

    private static final class Tuple2<A> {

        final A a;

        final A b;

        Tuple2(A a, A b) {
            this.a = a;
            this.b = b;
        }
    }

    private static final class CollectorsImpl<T, A, R> implements Collector<T, A, R> {

        private final Supplier<A> supplier;

        private final BiConsumer<A, T> accumulator;

        private final Function<A, R> finisher;

        public CollectorsImpl(Supplier<A> supplier, BiConsumer<A, T> accumulator) {
            this(supplier, accumulator, Collectors.<A, R>castIdentity());
        }

        public CollectorsImpl(Supplier<A> supplier, BiConsumer<A, T> accumulator, Function<A, R> finisher) {
            this.supplier = supplier;
            this.accumulator = accumulator;
            this.finisher = finisher;
        }

        @Override
        public Supplier<A> supplier() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public BiConsumer<A, T> accumulator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Nullable
        @Override
        public Function<A, R> finisher() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
