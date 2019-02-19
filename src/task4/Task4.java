package task4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {

    public static void main(String[] args) {
        Task4 imp = new Task4();
        List<String> impl = imp.scan();
        System.out.println(imp.countWords(impl));
        System.out.println(imp.countDistinctWords(impl));
        System.out.println(imp.uniqueWords(impl));
        System.out.println(imp.sortedList(impl));
        System.out.println(imp.countSymbols(impl));
    }
    private List<String> scan(){
        List<String> list = new ArrayList<>();
        String line;
       try {
           Scanner sc = new Scanner(System.in);
           while (!(line = sc.nextLine()).isEmpty()) {
               list.add(line);
           }
           return list;
       }
       catch (Exception e){
           throw new RuntimeException(e);
       }
    }

    private List<String> uniqueWords(List<String> text){
        return text.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
                .distinct()
                .collect(Collectors.toList());
    }

    private List<String> sortedList(List<String> text){
        return text.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    private long countDistinctWords(List<String> text){
        return text.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
                .distinct()
                .count();
    }

    private Map<String,Long> countWords(List<String> text){
        return text.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }

    private Map<String,Long> countSymbols(List<String> text){
        return text.stream()
                .flatMap(s -> Stream.of(s.split(" ")))
                .flatMap(s -> Stream.of(s.split("")).filter(ch -> !Character.isUpperCase(ch.charAt(0))))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    }
}
