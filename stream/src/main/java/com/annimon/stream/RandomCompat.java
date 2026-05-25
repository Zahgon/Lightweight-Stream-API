package com.annimon.stream;

import com.annimon.stream.function.DoubleSupplier;
import com.annimon.stream.function.IntSupplier;
import com.annimon.stream.function.LongSupplier;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/**
 * Backported stream apis from {@link java.util.Random} class.
 */
@SuppressWarnings("WeakerAccess")
public final class RandomCompat {

    @NotNull
    private final Random random;

    /**
     * Constructs object, inner {@code random} created with default constructor.
     */
    public RandomCompat() {
        this.random = new Random();
    }

    /**
     * Constructs object, inner {@code random} created with seed passed as param.
     *
     * @param seed  seed to initialize {@code random} object
     */
    public RandomCompat(long seed) {
        this.random = new Random(seed);
    }

    /**
     * Constructs object with the given {@code Random} instance.
     *
     * @param random  {@code Random} instance
     */
    public RandomCompat(@NotNull Random random) {
        this.random = random;
    }

    /**
     * Returns underlying {@link java.util.Random} instance.
     *
     * @return {@link java.util.Random} object instance
     */
    @NotNull
    public Random getRandom() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code int} values.
     *
     * <p>A pseudorandom {@code int} value is generated as if it's the result of
     * calling the method {@link Random#nextInt()}
     *
     * @param streamSize the number of values to generate
     * @return a stream of pseudorandom {@code int} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
    @NotNull
    public IntStream ints(long streamSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code long} values, each between zero (inclusive)
     * and one (exclusive).
     *
     * <p>A pseudorandom {@code long} value is generated as if it's the result of
     * calling the method {@link Random#nextLong()}
     *
     * @param streamSize  the number of values to generate
     * @return a stream of pseudorandom {@code long} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
    @NotNull
    public LongStream longs(long streamSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number of
     * pseudorandom {@code double} values, each between zero (inclusive)
     * and one (exclusive).
     *
     * <p>A pseudorandom {@code double} value is generated as if it's the result of
     * calling the method {@link Random#nextDouble()}
     *
     * @param streamSize  the number of values to generate
     * @return a stream of pseudorandom {@code double} values
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero
     */
    @NotNull
    public DoubleStream doubles(long streamSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code int}
     * values.
     *
     * <p>A pseudorandom {@code int} value is generated as if it's the result of
     * calling the method {@link Random#nextInt()}.
     *
     * @return a stream of pseudorandom {@code int} values
     */
    @NotNull
    public IntStream ints() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code long} values,
     * each between zero (inclusive) and one (exclusive).
     *
     * <p>A pseudorandom {@code long} value is generated as if it's the result of
     * calling the method {@link Random#nextLong()}.
     *
     * @return a stream of pseudorandom {@code long} values
     */
    @NotNull
    public LongStream longs() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code double} values,
     * each between zero (inclusive) and one (exclusive).
     *
     * <p>A pseudorandom {@code double} value is generated as if it's the result of
     * calling the method {@link Random#nextDouble()}.
     *
     * @return a stream of pseudorandom {@code double} values
     */
    @NotNull
    public DoubleStream doubles() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code int} values, each conforming to the given
     * origin (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) if each random value
     * @return a stream of pseudorandom {@code int} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin} is
     *         greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public IntStream ints(long streamSize, final int randomNumberOrigin, final int randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code long} values, each conforming
     * to the given origin (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) if each random value
     * @return a stream of pseudorandom {@code long} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin} is
     *         greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public LongStream longs(long streamSize, final long randomNumberOrigin, final long randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a stream producing the given {@code streamSize} number
     * of pseudorandom {@code double} values, each conforming
     * to the given origin (inclusive) and bound (exclusive).
     *
     * @param streamSize the number of values to generate
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) if each random value
     * @return a stream of pseudorandom {@code double} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code streamSize} is
     *         less than zero, or {@code randomNumberOrigin} is
     *         greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public DoubleStream doubles(long streamSize, final double randomNumberOrigin, final double randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code int}
     * values, each conforming to the given origin (inclusive) and bound (exclusive)
     *
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code int} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public IntStream ints(final int randomNumberOrigin, final int randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code long}
     * values, each conforming to the given origin (inclusive) and bound (exclusive)
     *
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code long} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public LongStream longs(final long randomNumberOrigin, final long randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an effectively unlimited stream of pseudorandom {@code double}
     * values, each conforming to the given origin (inclusive) and bound (exclusive)
     *
     * @param randomNumberOrigin  the origin (inclusive) of each random value
     * @param randomNumberBound  the bound (exclusive) of each random value
     * @return a stream of pseudorandom {@code double} values,
     *         each with the given origin (inclusive) and bound (exclusive)
     * @throws IllegalArgumentException if {@code randomNumberOrigin}
     *         is greater than or equal to {@code randomNumberBound}
     */
    @NotNull
    public DoubleStream doubles(final double randomNumberOrigin, final double randomNumberBound) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
