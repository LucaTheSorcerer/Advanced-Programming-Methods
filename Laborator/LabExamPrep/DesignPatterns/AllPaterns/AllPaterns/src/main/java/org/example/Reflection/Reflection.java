package org.example.Reflection;


import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws Throwable {

        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for(Field field : fields) {
            System.out.println("Field: " + field.getName());

            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation : annotations) {
                if(annotation instanceof MyAnnotation) {
                    MyAnnotation myAnnotation = (MyAnnotation) annotation;
                    System.out.println("\tAnnotation value: " + myAnnotation.value());
                }
            }

//            field.setAccessible(true);
//
//            Object obj = personClass.newInstance();
//            field.set(obj, "Ben Dover");
//            System.out.println("\tSet new value: " + field.get(obj));
        }


        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person person = constructor.newInstance("John Doe", 30);

        // Get method by name and parameter types
        Method setIncreaseAge = personClass.getMethod("increaseAge");
        setIncreaseAge.invoke(person);
        System.out.println("Age increased.");

    }


}
