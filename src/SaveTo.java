import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver{}