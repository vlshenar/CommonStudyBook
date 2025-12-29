package collectiontask.treemaptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class StreamSorter {
    public static void main(String[] args) {
        Integer[] arr = {27, 4, 8, 1, 4, 5, 13};
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer i: arr) map.put (i, i);
        ArrayList<Integer> list = new ArrayList<>(map.values());
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
    }
}
