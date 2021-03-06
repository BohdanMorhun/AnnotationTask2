import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        TextContainer tc = new TextContainer();
        Class<?> cl = tc.getClass();

        if(! cl.isAnnotationPresent(SaveTo.class)){
            System.out.println("Error");
            return;
        }
        SaveTo saveTo = cl.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method [] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            if(m.isAnnotationPresent(Saver.class)){
                m.invoke(tc, path);
                break;
            }
        }
        System.out.println("Done");
    }
}
