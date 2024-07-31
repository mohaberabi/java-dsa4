package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class TopKFrequent {


    static class Pair implements Comparable<Pair> {
        int data;
        int freq;

        @Override
        public int compareTo(Pair other) {
            return other.freq - freq == 0 ? other.data - data : other.freq - freq;
        }

        public Pair(int d, int f) {
            data = d;
            freq = f;
        }
    }


    static void printTopKElements(int[] arr, int k) {


        PriorityQueue<Pair> pq = new PriorityQueue<>();


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {

            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pq.add(new Pair(e.getKey(), e.getValue()));
        }


        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll().data);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4};
        printTopKElements(arr, 2);
    }

}
