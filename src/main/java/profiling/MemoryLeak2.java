package profiling;

import java.util.HashMap;
import java.util.Map;

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

}

public class MemoryLeak2 {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();

        // DO NOT MODIFY THE NUMBER OF ITERATIONS
        for(int i = 0; i < 1000000; i++) {
            map.put(new Person("john"), 1);
        }

        // DON'T DELETE THIS
        for(int i = 0; i <= 4000000; i++){
            System.out.println("");
        }
    }
}
