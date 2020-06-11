package fs.ac.simple;

import fs.ac.api.AuthorizeContext;
import fs.ac.api.AuthorizeMetadata;

public class SimpleAuthorizeContext implements AuthorizeContext {

    private String id;

    private AuthorizeMetadata metadata;

    private Object content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthorizeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AuthorizeMetadata metadata) {
        this.metadata = metadata;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
