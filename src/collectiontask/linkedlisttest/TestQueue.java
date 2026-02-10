package collectiontask.linkedlisttest;

import java.util.LinkedList;
import java.util.Queue;


/**
 * использование связного списка в качестве очереди
 */

public class TestQueue {
    private final static String[] fruits = {"apple", "orange", "qiwi", "melon", "lime",
            "banana", "pear", "watermelon", "garnet", "pineapple"};

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("first fruit");
        for(String s: fruits) q.offer(s);
        q.offer("last fruit");
        String s = q.poll();

        while(!q.isEmpty()) System.out.println(q.poll());
        System.out.println(q.poll()); //print null
        System.out.println(s);
    }
}
