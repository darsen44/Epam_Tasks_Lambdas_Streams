package task3;

import java.util.List;
import java.util.ListIterator;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new Generator().generate();
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
        System.out.println(list.stream().mapToInt(Integer::intValue).min());
        System.out.println(list.stream().mapToInt(Integer::intValue).max());
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
        double avg = list.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
        System.out.println(list.stream()
                                .mapToInt(Integer::intValue)
                                .filter(e -> e > avg)
                                .count());
        System.out.println(list.stream().reduce((x,y) -> x+y));
    }
}
