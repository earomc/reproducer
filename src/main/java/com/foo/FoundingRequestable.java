package com.foo;

public interface FoundingRequestable {
    /**
     * all classes that one can request founding from or classes that are able to create founding
     * requests through a founding procedure, implement this interface.
     */

    Class<? extends FoundingProcedure<?>> getProcedure();
}
