package com.annimon.stream.internal;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

public final class Compose {

    private Compose() {
    }

    public static Runnable runnables(final Runnable a, final Runnable b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Runnable closeables(final Closeable a, final Closeable b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Runnable closeables(final List<? extends Closeable> closeables) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Throwable handleException(Throwable e) {
        // Errors and runtime exceptions are thrown as is
        // Checked exceptions are wrapped in RuntimeException
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        } else if (e instanceof Error) {
            throw (Error) e;
        } else {
            throw new RuntimeException(e);
        }
    }
}
