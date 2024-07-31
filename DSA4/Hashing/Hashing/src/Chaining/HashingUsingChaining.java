package Chaining;

import java.util.ArrayList;

public class HashingUsingChaining {


    private final int bucket;

    private final ArrayList<Chain> arr;

    public HashingUsingChaining(int b) {
        bucket = b;

        arr = new ArrayList<>();

        for (int i = 0; i < bucket; i++) {
            arr.add(new Chain());
        }
    }


    boolean delete(int x) {
        int index = hash(x);
        return arr.get(index).delete(x);
    }


    void insert(int x) {
        int index = hash(x);
        Chain chain = arr.get(index);
        chain.insertToTail(x);
    }

    boolean search(int x) {
        int index = hash(x);
        return arr.get(index).search(x);
    }

    private int hash(int data) {
        return data % bucket;
    }


    public static void main(String[] args) {

        HashingUsingChaining hashmap = new HashingUsingChaining(7);
        hashmap.insert(100);
        System.out.println(hashmap.search(100));
        hashmap.delete(100);
        System.out.println(hashmap.search(100));

    }
}
