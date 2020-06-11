package fs.ac.simple.storage;

import fs.ac.api.AuthorizeContext;

import java.util.List;

public interface AuthorizeStorage {
    AuthorizeContext getContext(String authId);
    void storageContext(AuthorizeContext context);
    List<AuthorizeContext> getAllContexts();
}
