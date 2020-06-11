package fs.ac.api;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authorized {
    String code();
    String name();
    String scope();
    String description();
}
