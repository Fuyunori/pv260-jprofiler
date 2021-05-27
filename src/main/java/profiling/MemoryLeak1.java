package profiling;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeak1 {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        // DO NOT MODIFY THE NUMBER OF ITERATIONS
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
    }

    public static void main(String[] args) {
        MemoryLeak1 memoryLeak1 = new MemoryLeak1();
        memoryLeak1.populateList();

        // DON'T DELETE THIS
        for(int i = 0; i <= 2000000; i++){
            System.out.println("");
        }
    }
}
