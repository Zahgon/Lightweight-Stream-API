package com.annimon.stream.function;

import com.annimon.stream.Objects;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a {@code long}-valued predicate (function with boolean type result).
 *
 * @since 1.1.4
 * @see Predicate
 */
public interface LongPredicate {

    /**
     * Tests the value for satisfying predicate.
     *
     * @param value  the value to be tested
     * @return {@code true} if the value matches the predicate, otherwise {@code false}
     */
    boolean test(long value);

    class Util {

        private Util() {
        }

        /**
         * Applies logical AND to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code LongPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static LongPredicate and(@NotNull final LongPredicate p1, @NotNull final LongPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical OR to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code LongPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static LongPredicate or(@NotNull final LongPredicate p1, @NotNull final LongPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical XOR to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code LongPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static LongPredicate xor(@NotNull final LongPredicate p1, @NotNull final LongPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical negation to predicate.
         *
         * @param p1  the predicate to be negated
         * @return a composed {@code LongPredicate}
         * @throws NullPointerException if {@code p1} is null
         */
        public static LongPredicate negate(@NotNull final LongPredicate p1) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a safe {@code LongPredicate}.
         *
         * @param throwablePredicate  the predicate that may throw an exception
         * @return a {@code LongPredicate} or {@code false} if exception was thrown
         * @since 1.1.7
         * @see #safe(com.annimon.stream.function.ThrowableLongPredicate, boolean)
         */
        public static LongPredicate safe(@NotNull ThrowableLongPredicate<Throwable> throwablePredicate) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a safe {@code LongPredicate}.
         *
         * @param throwablePredicate  the predicate that may throw an exception
         * @param resultIfFailed  the result which returned if exception was thrown
         * @return a {@code LongPredicate} or {@code resultIfFailed}
         * @throws NullPointerException if {@code throwablePredicate} is null
         * @since 1.1.7
         */
        public static LongPredicate safe(@NotNull final ThrowableLongPredicate<Throwable> throwablePredicate, final boolean resultIfFailed) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
