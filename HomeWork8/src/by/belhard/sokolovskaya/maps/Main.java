package by.belhard.sokolovskaya.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Task 2
        Map<Integer, Product> products = new HashMap<>();
        products.put(111, new Product("Cheese"));
        products.put(222, new Product("Potato"));
        products.put(333, new Product("Milk"));

        printEntrySet(products);
        System.out.println();
        printKeySet(products);
        System.out.println();
        printValues(products);
        System.out.println();

        //Task 3
        String[] strings = new String[]{"Q", "G", "V", "Q", "G", "Q"};
        Integer[] ints = new Integer[]{5, 4, 2, 2};
        arrayToMap(strings).entrySet().forEach(System.out::println);
        System.out.println();
        arrayToMap(ints).entrySet().forEach(System.out::println);
    }

    //Task 2
    public static void printEntrySet(Map<Integer, Product> products) {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry);
        }
    }

    //Task 2
    public static void printKeySet(Map<Integer, Product> products) {
        products.keySet().forEach(System.out::println);
    }

    //Task 2
    public static void printValues(Map<Integer, Product> products) {
        products.values().forEach(System.out::println);
    }

    //Task 3
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }
        return map;
    }
}