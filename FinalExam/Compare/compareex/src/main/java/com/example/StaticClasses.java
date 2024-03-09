package com.example;

public class StaticClasses {

    private static String name = "Mirciu";

    static class A {
        private String mircea = name;

        static class B {
            private String opri = name;

            public void print() {
                System.out.println("salut");
            }
        }
    }


    public static void main(String[] args) {
        StaticClasses.A.B staticClass = new A.B();
        staticClass.print();
    }
}
