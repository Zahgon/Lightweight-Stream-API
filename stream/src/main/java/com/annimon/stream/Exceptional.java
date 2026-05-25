package com.annimon.stream;

import com.annimon.stream.function.Consumer;
import com.annimon.stream.function.Function;
import com.annimon.stream.function.Supplier;
import com.annimon.stream.function.ThrowableFunction;
import com.annimon.stream.function.ThrowableSupplier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A container for values which provided by {@code ThrowableSupplier}.
 *
 * Stores value which provided by {@link ThrowableSupplier} or an exception which were thrown.
 *
 * <pre><code>
 *     Exceptional.of(new ThrowableSupplier&lt;String, Throwable&gt;() {
 *          &#64;Override
 *          public String get() throws Throwable {
 *              return IOUtils.read(inputStream);
 *          }
 *      }).ifExceptionIs(IOException.class, new Consumer&lt;IOException&gt;() {
 *          &#64;Override
 *          public void accept(IOException exception) {
 *              logger.log(Level.WARNING, "read file", exception);
 *          }
 *      }).getOrElse("default string");
 *
 *      Exceptional.of(() -&gt; IOUtils.readBytes(inputStream)).getOrElse(new byte[0]);
 * </code></pre>
 *
 * @param <T> the type of the inner value
 */
@SuppressWarnings({ "WeakerAccess", "UnusedReturnValue" })
public class Exceptional<T> {

    /**
     * Returns an {@code Exceptional} with value provided by given {@code ThrowableSupplier} function.
     *
     * @param <T> the type of value
     * @param supplier  a supplier function
     * @return an {@code Exceptional}
     * @throws NullPointerException if {@code supplier} is null
     */
    @NotNull
    public static <T> Exceptional<T> of(@NotNull ThrowableSupplier<T, Throwable> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns an {@code Exceptional} with throwable already set.
     *
     * @param <T> the type of value
     * @param throwable  throwable instance
     * @return an {@code Exceptional}
     */
    @NotNull
    @Contract("_ -> new")
    public static <T> Exceptional<T> of(@NotNull Throwable throwable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private final T value;

    private final Throwable throwable;

    private Exceptional(@Nullable T value, @Nullable Throwable throwable) {
        this.value = value;
        this.throwable = throwable;
    }

    /**
     * Returns inner value.
     *
     * @return inner value.
     */
    @Nullable
    public T get() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks value present (i.e. there were no exceptions).
     *
     * @return {@code true} if a value present, {@code false} otherwise
     */
    public boolean isPresent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if there were no exceptions, otherwise returns {@code other}.
     *
     * @param other  the value to be returned if there were any exception
     * @return inner value if there were no exceptions, otherwise {@code other}
     */
    @Nullable
    public T getOrElse(@Nullable T other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if there were no exceptions, otherwise returns value produced by supplier function.
     *
     * @param other  the supplier function that produces value if there were any exception
     * @return inner value if there were no exceptions, otherwise value produced by supplier function
     * @since 1.1.9
     */
    @Nullable
    public T getOrElse(@NotNull Supplier<? extends T> other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Wraps inner value with {@code Optional} container
     *
     * @return an {@code Optional}
     */
    @NotNull
    public Optional<T> getOptional() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns exception.
     *
     * @return exception
     */
    @Nullable
    public Throwable getException() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if there were no exceptions, otherwise throws an exception.
     *
     * @return inner value if there were no exceptions
     * @throws Throwable that was thrown in supplier function
     */
    @Nullable
    public T getOrThrow() throws Throwable {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if there were no exceptions, otherwise throws {@code RuntimeException}.
     *
     * @return inner value if there were no exceptions
     * @throws RuntimeException with wrapped exception which was thrown in supplier function
     */
    @Nullable
    public T getOrThrowRuntimeException() throws RuntimeException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns inner value if there were no exceptions, otherwise throws the given {@code exception}.
     *
     * @param <E> the type of exception
     * @param exception  an exception to be thrown
     * @return inner value if there were no exceptions
     * @throws E if there were exceptions in supplier function
     */
    @Nullable
    public <E extends Throwable> T getOrThrow(@NotNull E exception) throws E {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code Exceptional} if there were no exceptions, otherwise
     * returns an {@code Exceptional} produced by supplier function.
     *
     * @param supplier  supplier function that produced an {@code Exceptional} to be returned
     * @return this {@code Exceptional} if there were no exceptions, otherwise
     *         an {@code Exceptional} produced by supplier function
     * @throws NullPointerException if {@code supplier} or its result is null
     */
    @NotNull
    public Exceptional<T> or(@NotNull Supplier<Exceptional<T>> supplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Applies custom operator on {@code Exceptional}.
     *
     * @param <R> the type of the result
     * @param function  a transforming function
     * @return a result of the transforming function
     * @throws NullPointerException if {@code function} is null
     * @since 1.1.9
     */
    @Nullable
    public <R> R custom(@NotNull Function<Exceptional<T>, R> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes mapping function on inner value if there were no exceptions.
     *
     * @param <U> the type of result value
     * @param mapper  mapping function
     * @return an {@code Exceptional} with transformed value if there were no exceptions
     * @throws NullPointerException if {@code mapper} is null
     */
    @NotNull
    public <U> Exceptional<U> map(@NotNull ThrowableFunction<? super T, ? extends U, Throwable> mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function with value if present.
     *
     * @param consumer  a consumer function
     * @return this {@code Exceptional}
     * @since 1.1.2
     */
    @NotNull
    public Exceptional<T> ifPresent(@NotNull Consumer<? super T> consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function if there were any exception.
     *
     * @param consumer  a consumer function
     * @return an {@code Exceptional}
     */
    @NotNull
    public Exceptional<T> ifException(@NotNull Consumer<Throwable> consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes consumer function if exception class matches {@code throwableClass}.
     *
     * @param <E> the type of exception
     * @param throwableClass  the class of an exception to be compared
     * @param consumer  a consumer function
     * @return an {@code Exceptional}
     */
    @NotNull
    @SuppressWarnings("unchecked")
    public <E extends Throwable> Exceptional<T> ifExceptionIs(@NotNull Class<E> throwableClass, @NotNull Consumer<? super E> consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code Exceptional} if there were no exceptions, otherwise
     * calls {@code function} and wraps produced result with an {@code Exceptional}.
     *
     * @param function  recovering function
     * @return this {@code Exceptional} if there were no exceptions, otherwise
     *         an {@code Exceptional} with wrapped recovering function result
     * @throws NullPointerException if {@code function} is null
     * @since 1.1.2
     */
    @NotNull
    public Exceptional<T> recover(@NotNull final ThrowableFunction<Throwable, ? extends T, Throwable> function) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns current {@code Exceptional} if there were no exceptions, otherwise
     * returns an {@code Exceptional} produced by {@code function}.
     *
     * @param function  recovering function
     * @return this {@code Exceptional} if there were no exceptions, otherwise
     *         an {@code Exceptional} produced by recovering function
     * @throws NullPointerException if {@code function} or produced result is null
     * @since 1.1.2
     */
    @NotNull
    public Exceptional<T> recoverWith(@NotNull final Function<Throwable, ? extends Exceptional<T>> function) {
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
