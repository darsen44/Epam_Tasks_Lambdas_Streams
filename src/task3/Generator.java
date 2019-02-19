package task3;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generator {
    public List<Integer> generate(){
        Random rand = new Random();
        return Stream.generate(() -> rand.nextInt(1000)).limit(20).collect(Collectors.toList());
    }

    public List<Integer> generate(int limit){
        Random rand = new Random();
        return Stream.iterate(10,(e)-> rand.nextInt(1000)).limit(limit).collect(Collectors.toList());
    }
}
