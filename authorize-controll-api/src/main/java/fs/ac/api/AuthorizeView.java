package fs.ac.api;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthorizeView {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface Field {
        String name();
        String desc() default "";
        String type() default FieldType.TEXT_FIELD;
        int order() default -1;
    }

    interface FieldType {
        String TEXT_FIELD = "text-field";
        String TEXT_AREA = "text-area";
        String OPTION_SINGLE = "option-single";
        String OPTION_MULTI = "option-multi";
    }
}
