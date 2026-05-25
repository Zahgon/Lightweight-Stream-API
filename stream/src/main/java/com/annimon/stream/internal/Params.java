package com.annimon.stream.internal;

import org.jetbrains.annotations.NotNull;

/**
 * Parameters for streams.
 */
public final class Params {

    public Runnable closeHandler;

    public static Params wrapWithCloseHandler(Params params, @NotNull Runnable closeHandler) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
