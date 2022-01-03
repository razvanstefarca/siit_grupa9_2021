package Generics;

import java.util.Arrays;


public class ExchangePositions {
    public static final <T> void swap(T[] a, int i, int j) {
        T t = a[i]; //t  = hello
        a[i] = a[j]; // a de 0 = goodbye
        a[j] = t;
    }

    public static void main(String... args) {
        String[] a = {"Hello", "Goodbye"};
        swap(a, 0, 1);
        System.out.println("a:" + Arrays.toString(a));
    }
}
