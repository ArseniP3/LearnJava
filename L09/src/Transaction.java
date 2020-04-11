import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Transaction {
}


class TransactionAnalyzer{
    private static void analyze(Class cls) {
        for (Method meth : cls.getMethods()) {
            for (Annotation annotation : meth.getAnnotations()) {
                if (annotation instanceof Transaction) {
                    System.out.println("Transaction is started");
                    try {
                        meth.invoke(new Object());
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Transaction is ended");
                }
            }
        }
    }
}