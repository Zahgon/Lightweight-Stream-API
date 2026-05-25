package com.annimon.stream.function;

import com.annimon.stream.Objects;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a {@code boolean}-valued predicate (function with boolean type result).
 *
 * @since 1.1.8
 * @see Predicate
 * @see UnaryOperator
 */
public interface BooleanPredicate {

    /**
     * Tests the value for satisfying predicate.
     *
     * @param value  the value to be tested
     * @return {@code true} if the value matches the predicate, otherwise {@code false}
     */
    boolean test(boolean value);

    class Util {

        private Util() {
        }

        /**
         * Returns a predicate that always returns its input argument.
         *
         * @return a predicate that always returns its input argument
         */
        public static BooleanPredicate identity() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical AND to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code BooleanPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static BooleanPredicate and(@NotNull final BooleanPredicate p1, @NotNull final BooleanPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical OR to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code BooleanPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static BooleanPredicate or(@NotNull final BooleanPredicate p1, @NotNull final BooleanPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical XOR to predicates.
         *
         * @param p1  the first predicate
         * @param p2  the second predicate
         * @return a composed {@code BooleanPredicate}
         * @throws NullPointerException if {@code p1} or {@code p2} is null
         */
        public static BooleanPredicate xor(@NotNull final BooleanPredicate p1, @NotNull final BooleanPredicate p2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Applies logical negation to predicate.
         *
         * @param p1  the predicate to be negated
         * @return a composed {@code BooleanPredicate}
         * @throws NullPointerException if {@code p1} is null
         */
        public static BooleanPredicate negate(@NotNull final BooleanPredicate p1) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
