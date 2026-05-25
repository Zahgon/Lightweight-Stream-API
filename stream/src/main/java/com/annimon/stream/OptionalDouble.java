package com.annimon.stream;

import com.annimon.stream.function.DoubleConsumer;
import com.annimon.stream.function.DoubleFunction;
import com.annimon.stream.function.DoublePredicate;
import com.annimon.stream.function.DoubleSupplier;
import com.annimon.stream.function.DoubleToIntFunction;
import com.annimon.stream.function.DoubleToLongFunction;
import com.annimon.stream.function.DoubleUnaryOperator;
import com.annimon.stream.function.Function;
import com.annimon.stream.function.Supplier;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A container object which may or may not contain a {@code double} value.
 *
 * @since 1.1.4
 * @see Optional
 */
public final class OptionalDouble {

    private static final OptionalDouble EMPTY = new OptionalDouble();

    /**
     * Returns an empty {@code OptionalDouble} instance.
     *
     * @return an empty {@code OptionalDouble}
     */
    @NotNull
    public static OptionalDouble empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code OptionalDouble} with the specified value present.
     *
     * @param value  the value to be present
     * @return an {@code OptionalDouble} with the value present
     */
    @NotNull
    public static OptionalDouble of(double value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code OptionalDouble} with the specified value, or empty {@code OptionalDouble} if value is null.
     *
     * @param value the value which can be null
     * @return an {@code OptionalDouble}
     * @since 1.2.1
     */
    @NotNull
    public static OptionalDouble ofNullable(@Nullable Double value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final boolean isPresent;

    private final double value;

    private OptionalDouble() {
        this.isPresent = false;
        this.value = 0;
    }

    private OptionalDouble(double value) {
        this.isPresent = true;
        this.value = value;
    }

    /**
     * Returns an inner value if present, otherwise throws {@code NoSuchElementException}.
     *
     * Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
     *
     * @return the inner value of this {@code OptionalDouble}
     * @throws NoSuchElementException if there is no value present
     * @see OptionalDouble#isPresent()
     * @see #orElseThrow()
     */
    public double getAsDouble() {
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
    public void ifPresent(@NotNull DoubleConsumer consumer) {
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
    public void ifPresentOrElse(@NotNull DoubleConsumer consumer, @NotNull Runnable emptyAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function with the value if present.
     * This method same as {@code ifPresent}, but does not breaks chaining
     *
     * @param consumer  consumer function
     * @return this {@code OptionalDouble}
     * @see #ifPresent(com.annimon.stream.function.DoubleConsumer)
     */
    @NotNull
    public OptionalDouble executeIfPresent(@NotNull DoubleConsumer consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes action function if value is absent.
     *
     * @param action  action that invokes if value absent
     * @return this {@code OptionalDouble}
     */
    @NotNull
    public OptionalDouble executeIfAbsent(@NotNull Runnable action) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies custom operator on {@code OptionalDouble}.
     *
     * @param <R> the type of the result
     * @param function  a transforming function
     * @return a result of the transforming function
     * @throws NullPointerException if {@code function} is null
     * @since 1.1.9
     */
    @Nullable
    public <R> R custom(@NotNull Function<OptionalDouble, R> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalDouble} if the value is present and matches predicate,
     *         otherwise an empty {@code OptionalDouble}
     */
    @NotNull
    public OptionalDouble filter(@NotNull DoublePredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs negated filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalDouble} if the value is present and doesn't matches predicate,
     *              otherwise an empty {@code OptionalDouble}
     * @since 1.1.9
     */
    @NotNull
    public OptionalDouble filterNot(@NotNull DoublePredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes the given mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalDouble} with transformed value if present,
     *         otherwise an empty {@code OptionalDouble}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     */
    @NotNull
    public OptionalDouble map(@NotNull DoubleUnaryOperator mapper) {
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
    public <U> Optional<U> mapToObj(@NotNull DoubleFunction<U> mapper) {
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
    public OptionalInt mapToInt(@NotNull DoubleToIntFunction mapper) {
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
    public OptionalLong mapToLong(@NotNull DoubleToLongFunction mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps a value into {@code DoubleStream} if present,
     * otherwise returns an empty {@code DoubleStream}.
     *
     * @return the optional value as an {@code DoubleStream}
     */
    @NotNull
    public DoubleStream stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code OptionalDouble} if value is present, otherwise
     * returns an {@code OptionalDouble} produced by supplier function.
     *
     * @param supplier  supplier function that produces an {@code OptionalDouble} to be returned
     * @return this {@code OptionalDouble} if value is present, otherwise
     *         an {@code OptionalDouble} produced by supplier function
     * @throws NullPointerException if value is not present and
     *         {@code supplier} or value produced by it is {@code null}
     */
    @NotNull
    public OptionalDouble or(@NotNull Supplier<OptionalDouble> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if present, otherwise returns {@code other}.
     *
     * @param other  the value to be returned if there is no value present
     * @return the value, if present, otherwise {@code other}
     */
    public double orElse(double other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value if present, otherwise returns value produced by supplier function.
     *
     * @param other  supplier function that produces value if inner value is not present
     * @return the value if present otherwise the result of {@code other.getAsDouble()}
     * @throws NullPointerException if value is not present and {@code other} is null
     */
    public double orElseGet(@NotNull DoubleSupplier other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if present, otherwise throws {@code NoSuchElementException}.
     *
     * @return inner value if present
     * @throws NoSuchElementException if inner value is not present
     * @since 1.2.0
     */
    public double orElseThrow() {
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
    public <X extends Throwable> double orElseThrow(@NotNull Supplier<X> exceptionSupplier) throws X {
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
