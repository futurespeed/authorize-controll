package fs.ac.api;

public interface AuthorizeContext {
    AuthorizeMetadata getMetadata();
    String getId();
    Object getContent();
}
