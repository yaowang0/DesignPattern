package com.expgiga.javaDesignModel;

/**
 * Created by YaoWang on 2017/8/18.
 */
public class Singleton {
    private Singleton() {

    }

    private static Singleton instance = null;

    private static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if(null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
