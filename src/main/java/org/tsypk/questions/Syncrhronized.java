package org.tsypk.questions;

public class Syncrhronized {
    public Integer add(Integer a, Integer b) {
        synchronized (a) {
            System.out.println("a is locked");
            synchronized (b) {
                System.out.println("b is locked");
                return a + b;
            }
        }
    }
}
