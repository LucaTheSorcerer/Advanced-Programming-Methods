package org.example.Reflection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "Default";
}

public class Person {

    @MyAnnotation("Mike Oxlong")
    private String name;

    private int age;

    @MyAnnotation("setAge")
    private void increaseAge() {
        age++;
    }
}
