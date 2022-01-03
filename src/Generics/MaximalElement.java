package Generics;

import java.util.ArrayList;
import java.util.List;

public class MaximalElement {
    public static <T extends Comparable> T maximalElement(List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(max) > 0) {
                max = elem1;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0);

        maximalElement(list, 0, 4);

    }
}
