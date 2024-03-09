package org.example.Streams;

import java.util.*;

public class StreamPerson {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Bob", 20),
                new Person("Dob", 25),
                new Person("Zob", 30)
        );

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        Collections.sort(personList, (Person o1, Person o2) -> {return o1.getAge() - o2.getAge();});

        Collections.sort(personList, (o1, o2) -> o1.getAge() - o2.getAge());

        op add = (int a, int b) -> a + b;
        op mul = (int a, int b) -> {return a * b;};
        op div = (int a, int b) -> a / b;
        System.out.println(add.doOper(2, 3));

        message msg = m -> System.out.println("Hello " + m);
        msg.say("World");

        op add1 = (int a, int b) -> a + b;
        System.out.println(new T().exec(2, 3, add));
    }
}
