package com.annimon.stream.function;

import com.annimon.stream.Objects;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a predicate (function with boolean type result).
 *
 * @param <T> the type of the input to the function
 */
public interface Predicate<T> {

    /**
     * Tests the value for satisfying predicate.
     *
     * @param value  the value to be tested
     * @return {@code true} if the value matches the predicate, otherwise {@code false}
     */
    boolean test(T value);

    class Util {

        private Util() {
        }

        /**
         * Applies logical AND to predicates.
         *
         * @param <T> the type of the input to the function
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code Predicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static <T> Predicate<T> and(@NotNull final Predicate<? super T> p1, @NotNull final Predicate<? super T> p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical AND to multiple predicates.
         *
         * @param <T> the type of the input to the function
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @param rest  the rest predicates
         * @return a composed {@code Predicate}
         * @throws NullPointerException if any of predicates are null
         * @since 1.2.1
         */
        public static <T> Predicate<T> and(@NotNull final Predicate<? super T> p1, @NotNull final Predicate<? super T> p2, @NotNull final Predicate<? super T>... rest) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical OR to predicates.
         *
         * @param <T> the type of the input to the function
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code Predicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static <T> Predicate<T> or(@NotNull final Predicate<? super T> p1, @NotNull final Predicate<? super T> p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical OR to multiple predicates.
         *
         * @param <T> the type of the input to the function
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @param rest  the rest predicates
         * @return a composed {@code Predicate}
         * @throws NullPointerException if any of predicates are null
         */
        public static <T> Predicate<T> or(@NotNull final Predicate<? super T> p1, @NotNull final Predicate<? super T> p2, @NotNull final Predicate<? super T>... rest) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical XOR to predicates.
         *
         * @param <T> the type of the input to the function
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code Predicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static <T> Predicate<T> xor(@NotNull final Predicate<? super T> p1, @NotNull final Predicate<? super T> p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical negation to predicate.
         *
         * @param <T> the type of the input to the function
         * @param predicate  the predicate to be negated
         * @return a composed {@code Predicate}
         * @throws NullPointerException if {@code p1} is null
         */
        public static <T> Predicate<T> negate(@NotNull final Predicate<? super T> predicate) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Checks that input value is not null.
         *
         * @param <T> the type of the input to the function
         * @return {@code Predicate} that checks value to be not null
         */
        public static <T> Predicate<T> notNull() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a safe {@code Predicate}.
         *
         * @param <T> the type of the input to the function
         * @param throwablePredicate  the predicate that may throw an exception
         * @return a {@code Predicate} or {@code false} if exception was thrown
         */
        public static <T> Predicate<T> safe(@NotNull ThrowablePredicate<? super T, Throwable> throwablePredicate) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a safe {@code Predicate}.
         *
         * @param <T> the type of the input to the function
         * @param throwablePredicate  the predicate that may throw an exception
         * @param resultIfFailed  the result which returned if exception was thrown
         * @return a {@code Predicate} or {@code resultIfFailed}
         * @throws NullPointerException if {@code throwablePredicate} is null
         */
        public static <T> Predicate<T> safe(@NotNull final ThrowablePredicate<? super T, Throwable> throwablePredicate, final boolean resultIfFailed) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
