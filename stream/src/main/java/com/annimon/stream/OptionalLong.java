package com.annimon.stream;

import com.annimon.stream.function.Function;
import com.annimon.stream.function.LongConsumer;
import com.annimon.stream.function.LongFunction;
import com.annimon.stream.function.LongPredicate;
import com.annimon.stream.function.LongSupplier;
import com.annimon.stream.function.LongToIntFunction;
import com.annimon.stream.function.LongUnaryOperator;
import com.annimon.stream.function.Supplier;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A container object which may or may not contain a {@code long} value.
 *
 * @since 1.1.4
 * @see Optional
 */
public final class OptionalLong {

    private static final OptionalLong EMPTY = new OptionalLong();

    /**
     * Returns an empty {@code OptionalLong} instance.
     *
     * @return an empty {@code OptionalLong}
     */
    @NotNull
    public static OptionalLong empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code OptionalLong} with the specified value present.
     *
     * @param value  the value to be present
     * @return an {@code OptionalLong} with the value present
     */
    @NotNull
    public static OptionalLong of(long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code OptionalLong} with the specified value, or empty {@code OptionalLong} if value is null.
     *
     * @param value the value which can be null
     * @return an {@code OptionalLong}
     * @since 1.2.1
     */
    @NotNull
    public static OptionalLong ofNullable(@Nullable Long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final boolean isPresent;

    private final long value;

    private OptionalLong() {
        this.isPresent = false;
        this.value = 0;
    }

    private OptionalLong(long value) {
        this.isPresent = true;
        this.value = value;
    }

    /**
     * Returns an inner value if present, otherwise throws {@code NoSuchElementException}.
     *
     * Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
     *
     * @return the inner value of this {@code OptionalLong}
     * @throws NoSuchElementException if there is no value present
     * @see OptionalLong#isPresent()
     * @see #orElseThrow()
     */
    public long getAsLong() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks value present.
     *
     * @return {@code true} if a value present, {@code false} otherwise
     */
    public boolean isPresent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks the value is not present.
     *
     * @return {@code true} if a value is not present, {@code false} otherwise
     * @since 1.2.1
     */
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function with value if present, otherwise does nothing.
     *
     * @param consumer  the consumer function to be executed if a value is present
     * @throws NullPointerException if value is present and {@code consumer} is null
     */
    public void ifPresent(@NotNull LongConsumer consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If a value is present, performs the given action with the value,
     * otherwise performs the empty-based action.
     *
     * @param consumer  the consumer function to be executed, if a value is present
     * @param emptyAction  the empty-based action to be performed, if no value is present
     * @throws NullPointerException if a value is present and the given consumer function is null,
     *         or no value is present and the given empty-based action is null.
     */
    public void ifPresentOrElse(@NotNull LongConsumer consumer, @NotNull Runnable emptyAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function with the value if present.
     * This method same as {@code ifPresent}, but does not breaks chaining
     *
     * @param consumer  consumer function
     * @return this {@code OptionalLong}
     * @see #ifPresent(com.annimon.stream.function.LongConsumer)
     */
    @NotNull
    public OptionalLong executeIfPresent(@NotNull LongConsumer consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes action function if value is absent.
     *
     * @param action  action that invokes if value absent
     * @return this {@code OptionalLong}
     */
    @NotNull
    public OptionalLong executeIfAbsent(@NotNull Runnable action) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies custom operator on {@code OptionalLong}.
     *
     * @param <R> the type of the result
     * @param function  a transforming function
     * @return a result of the transforming function
     * @throws NullPointerException if {@code function} is null
     * @since 1.1.9
     */
    @Nullable
    public <R> R custom(@NotNull Function<OptionalLong, R> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalLong} if the value is present and matches predicate,
     *         otherwise an empty {@code OptionalLong}
     */
    @NotNull
    public OptionalLong filter(@NotNull LongPredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs negated filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalLong} if the value is present and doesn't matches predicate,
     *              otherwise an empty {@code OptionalLong}
     * @since 1.1.9
     */
    @NotNull
    public OptionalLong filterNot(@NotNull LongPredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes the given mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalLong} with transformed value if present,
     *         otherwise an empty {@code OptionalLong}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     */
    @NotNull
    public OptionalLong map(@NotNull LongUnaryOperator mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes the given mapping function on inner value if present.
     *
     * @param <U> the type of result value
     * @param mapper  mapping function
     * @return an {@code Optional} with transformed value if present,
     *         otherwise an empty {@code Optional}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     */
    @NotNull
    public <U> Optional<U> mapToObj(@NotNull LongFunction<U> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes the given mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalInt} with transformed value if present,
     *         otherwise an empty {@code OptionalInt}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     */
    @NotNull
    public OptionalInt mapToInt(@NotNull LongToIntFunction mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps a value into {@code LongStream} if present,
     * otherwise returns an empty {@code LongStream}.
     *
     * @return the optional value as an {@code LongStream}
     */
    @NotNull
    public LongStream stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code OptionalLong} if value is present, otherwise
     * returns an {@code OptionalLong} produced by supplier function.
     *
     * @param supplier  supplier function that produces an {@code OptionalLong} to be returned
     * @return this {@code OptionalLong} if value is present, otherwise
     *         an {@code OptionalLong} produced by supplier function
     * @throws NullPointerException if value is not present and
     *         {@code supplier} or value produced by it is {@code null}
     */
    @NotNull
    public OptionalLong or(@NotNull Supplier<OptionalLong> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if present, otherwise returns {@code other}.
     *
     * @param other  the value to be returned if there is no value present
     * @return the value, if present, otherwise {@code other}
     */
    public long orElse(long other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value if present, otherwise returns value produced by supplier function.
     *
     * @param other  supplier function that produces value if inner value is not present
     * @return the value if present otherwise the result of {@code other.getAsLong()}
     * @throws NullPointerException if value is not present and {@code other} is null
     */
    public long orElseGet(@NotNull LongSupplier other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if present, otherwise throws {@code NoSuchElementException}.
     *
     * @return inner value if present
     * @throws NoSuchElementException if inner value is not present
     * @since 1.2.0
     */
    public long orElseThrow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value if present, otherwise throws an exception provided by supplier function.
     *
     * @param <X> the type of exception to be thrown
     * @param exceptionSupplier  supplier function that produces an exception to be thrown
     * @return inner value if present
     * @throws X if inner value is not present
     */
    public <X extends Throwable> long orElseThrow(@NotNull Supplier<X> exceptionSupplier) throws X {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
