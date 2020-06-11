package fs.ac.core;

import fs.ac.api.AuthorizeContext;

public class AuthorizeManager {

    private AuthorizeProcessor authorizeProcessor;

    public boolean authorization(AuthorizeContext context){
        return authorizeProcessor.authorization(context);
    }

    public void authorizationSuccess(AuthorizeContext context){
        authorizeProcessor.authorizationSuccess(context);
    }

    public AuthorizeProcessor getAuthorizeProcessor() {
        return authorizeProcessor;
    }

    public void setAuthorizeProcessor(AuthorizeProcessor authorizeProcessor) {
        this.authorizeProcessor = authorizeProcessor;
    }
}
