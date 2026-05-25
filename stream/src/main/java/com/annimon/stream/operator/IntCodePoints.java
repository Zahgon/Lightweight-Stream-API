package com.annimon.stream.operator;

import com.annimon.stream.iterator.PrimitiveIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class IntCodePoints extends PrimitiveIterator.OfInt {

    private final CharSequence charSequence;

    private final boolean isString;

    private int current;

    private int length;

    public IntCodePoints(@NotNull CharSequence charSequence) {
        this.charSequence = charSequence;
        isString = (charSequence instanceof String);
        current = 0;
        length = -1;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int nextInt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int ensureLength() {
        if (isString) {
            if (length == -1) {
                length = charSequence.length();
            }
            return length;
        }
        return charSequence.length();
    }
}
