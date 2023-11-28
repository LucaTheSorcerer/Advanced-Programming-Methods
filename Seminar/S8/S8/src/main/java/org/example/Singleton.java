package org.example;

//public class Singleton {
//
//    private static volatile Singleton instance = null;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if(instance == null) {
//            synchronized (Singleton.class) {
//                if(instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//
//        return instance;
//    }
//}


public class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}

