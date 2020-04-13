package Lecture09;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassAnalyzer {

    public void analyzeField(Class cls){
        Field[] field = cls.getDeclaredFields();
        int count = 1;
        
        for (Field fields : field) {
            System.out.println("Field № :" + count + " : " + fields.getName());
            count++;
        }
    }

    public void analyzeMethod(Class cls){
        Method[] meth = cls.getDeclaredMethods();
        int count = 1;
        for (Method method : meth) {
            System.out.println("Method # :" + count+ " : " + method.getName() + ". Type:" + method.getReturnType());
            count++;
        }
    }

    public void analyzeConstructor(Class cls){
        Constructor[] constructor = cls.getDeclaredConstructors();
        int count = 1;
        for (Constructor constructors : constructor) {
            System.out.println("Constructor # :" + count+ " : " + constructors.getName());
            count++;
        }
    }

    public void analyzeAnnotation(Class cls){
        Annotation[] annot = cls.getDeclaredAnnotations();
        int count = 1;
        for (Annotation annotation : annot) {
            System.out.println("Constructor # :" + count+ " : " + annotation.getClass().getName());
        }
    }
    public void analyzeClass (Class cls){
        analyzeField(cls);
        analyzeMethod(cls);
        analyzeConstructor(cls);
        analyzeAnnotation(cls);
    }
}
