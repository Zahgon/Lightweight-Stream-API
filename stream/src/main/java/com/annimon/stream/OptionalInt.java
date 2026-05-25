package com.annimon.stream;

import com.annimon.stream.function.Function;
import com.annimon.stream.function.IntConsumer;
import com.annimon.stream.function.IntFunction;
import com.annimon.stream.function.IntPredicate;
import com.annimon.stream.function.IntSupplier;
import com.annimon.stream.function.IntToDoubleFunction;
import com.annimon.stream.function.IntToLongFunction;
import com.annimon.stream.function.IntUnaryOperator;
import com.annimon.stream.function.Supplier;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A container object which may or may not contain a {@code int} value.
 * If a value is present, {@code isPresent()} will return {@code true} and
 * {@code getAsInt()} will return the value.
 */
public final class OptionalInt {

    /**
     * Common instance for {@code empty()}.
     */
    private static final OptionalInt EMPTY = new OptionalInt();

    /**
     * If true then the value is present, otherwise indicates no value is present
     */
    private final boolean isPresent;

    private final int value;

    /**
     * Construct an empty instance.
     */
    private OptionalInt() {
        this.isPresent = false;
        this.value = 0;
    }

    /**
     * Returns an empty {@code OptionalInt} instance.  No value is present for this
     * OptionalInt.
     *
     * @return an empty {@code OptionalInt}
     */
    @NotNull
    public static OptionalInt empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct an instance with the value present.
     *
     * @param value the int value to be present
     */
    private OptionalInt(int value) {
        this.isPresent = true;
        this.value = value;
    }

    /**
     * Return an {@code OptionalInt} with the specified value present.
     *
     * @param value the value to be present
     * @return an {@code OptionalInt} with the value present
     */
    @NotNull
    public static OptionalInt of(int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code OptionalInt} with the specified value, or empty {@code OptionalInt} if value is null.
     *
     * @param value the value which can be null
     * @return an {@code OptionalInt}
     * @since 1.2.1
     */
    @NotNull
    public static OptionalInt ofNullable(@Nullable Integer value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * If a value is present in this {@code OptionalInt}, returns the value,
     * otherwise throws {@code NoSuchElementException}.
     *
     * Since 1.2.0 prefer {@link #orElseThrow()} method as it has readable name.
     *
     * @return the value held by this {@code OptionalInt}
     * @throws NoSuchElementException if there is no value present
     * @see OptionalInt#isPresent()
     * @see #orElseThrow()
     */
    public int getAsInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Return {@code true} if there is a value present, otherwise {@code false}.
     *
     * @return {@code true} if there is a value present, otherwise {@code false}
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
     * @param consumer block to be executed if a value is present
     * @throws NullPointerException if value is present and {@code consumer} is
     *         null
     */
    public void ifPresent(@NotNull IntConsumer consumer) {
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
     * @since 1.1.4
     */
    public void ifPresentOrElse(@NotNull IntConsumer consumer, @NotNull Runnable emptyAction) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function with value if present.
     * This method same as {@code ifPresent}, but does not break chaining
     *
     * @param consumer  consumer function
     * @return this {@code OptionalInt}
     * @see #ifPresent(com.annimon.stream.function.IntConsumer)
     * @since 1.1.2
     */
    @NotNull
    public OptionalInt executeIfPresent(@NotNull IntConsumer consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes action function if value is absent.
     *
     * @param action  action that invokes if value absent
     * @return this {@code OptionalInt}
     * @since 1.1.2
     */
    @NotNull
    public OptionalInt executeIfAbsent(@NotNull Runnable action) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies custom operator on {@code OptionalInt}.
     *
     * @param <R> the type of the result
     * @param function  a transforming function
     * @return a result of the transforming function
     * @throws NullPointerException if {@code function} is null
     * @since 1.1.9
     */
    @Nullable
    public <R> R custom(@NotNull Function<OptionalInt, R> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalInt} if the value is present and matches predicate,
     *         otherwise an empty {@code OptionalInt}
     * @since 1.1.4
     */
    @NotNull
    public OptionalInt filter(@NotNull IntPredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Performs negated filtering on inner value if it is present.
     *
     * @param predicate  a predicate function
     * @return this {@code OptionalInt} if the value is present and doesn't matches predicate,
     *              otherwise an empty {@code OptionalInt}
     * @since 1.1.9
     */
    @NotNull
    public OptionalInt filterNot(@NotNull IntPredicate predicate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalInt} with transformed value if present,
     *         otherwise an empty {@code OptionalInt}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     * @since 1.1.3
     */
    @NotNull
    public OptionalInt map(@NotNull IntUnaryOperator mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes mapping function on inner value if present.
     *
     * @param <U> the type of result value
     * @param mapper  mapping function
     * @return an {@code Optional} with transformed value if present,
     *         otherwise an empty {@code Optional}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     * @since 1.1.3
     */
    @NotNull
    public <U> Optional<U> mapToObj(@NotNull IntFunction<U> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalLong} with transformed value if present,
     *         otherwise an empty {@code OptionalLong}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     * @since 1.1.4
     */
    @NotNull
    public OptionalLong mapToLong(@NotNull IntToLongFunction mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes mapping function on inner value if present.
     *
     * @param mapper  mapping function
     * @return an {@code OptionalDouble} with transformed value if present,
     *         otherwise an empty {@code OptionalDouble}
     * @throws NullPointerException if value is present and
     *         {@code mapper} is {@code null}
     * @since 1.1.4
     */
    @NotNull
    public OptionalDouble mapToDouble(@NotNull IntToDoubleFunction mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps a value into {@code IntStream} if present, otherwise returns an empty {@code IntStream}.
     *
     * @return the optional value as an {@code IntStream}
     */
    @NotNull
    public IntStream stream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code OptionalInt} if value is present, otherwise
     * returns an {@code OptionalInt} produced by supplier function.
     *
     * @param supplier  supplier function that produces an {@code OptionalInt} to be returned
     * @return this {@code OptionalInt} if value is present, otherwise
     *         an {@code OptionalInt} produced by supplier function
     * @throws NullPointerException if value is not present and
     *         {@code supplier} or value produced by it is {@code null}
     */
    @NotNull
    public OptionalInt or(@NotNull Supplier<OptionalInt> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value if present, otherwise returns {@code other}.
     *
     * @param other  the value to be returned if there is no value present
     * @return the value, if present, otherwise {@code other}
     */
    public int orElse(int other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value if present, otherwise invokes {@code other} and returns
     * the result of that invocation.
     *
     * @param other a {@code IntSupplier} whose result is returned if no value
     *              is present
     * @return the value if present otherwise the result of {@code other.getAsInt()}
     * @throws NullPointerException if value is not present and {@code other} is
     *         null
     */
    public int orElseGet(@NotNull IntSupplier other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if present, otherwise throws {@code NoSuchElementException}.
     *
     * @return inner value if present
     * @throws NoSuchElementException if inner value is not present
     * @since 1.2.0
     */
    public int orElseThrow() {
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
    public <X extends Throwable> int orElseThrow(@NotNull Supplier<X> exceptionSupplier) throws X {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Indicates whether some other object is "equal to" this OptionalInt. The
     * other object is considered equal if:
     * <ul>
     *    <li> it is also an {@code OptionalInt} and;
     *    <li> both instances have no value present or;
     *    <li> the present values are "equal to" each other via {@code ==}.
     * </ul>
     *
     * @param obj an object to be tested for equality
     * @return {@code true} if the other object is "equal to" this object
     *         otherwise {@code false}
     */
    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the hash code value of the present value, if any, or 0 (zero) if
     * no value is present.
     *
     * @return hash code value of the present value or 0 if no value is present
     */
    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a non-empty string representation of this object suitable for
     * debugging.
     *
     * @return the string representation of this instance
     */
    @NotNull
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
