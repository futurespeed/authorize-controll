package fs.ac.core;

import fs.ac.api.AuthorizeContext;

public interface AuthorizeProcessor {
    boolean authorization(AuthorizeContext context);
    void authorizationSuccess(AuthorizeContext context);
}
