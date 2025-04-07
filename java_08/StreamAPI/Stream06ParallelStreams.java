import java.util.Arrays;
import java.util.List;

public class Stream06ParallelStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Sequential Processing (Single Thread)
        System.out.println("Sequential Stream:");
        names.stream().forEach(name -> 
            System.out.println(Thread.currentThread().getName() + " -> " + name));

        // Parallel Processing (Multiple Threads)
        System.out.println("\nParallel Stream:");
        names.parallelStream().forEach(name -> 
            System.out.println(Thread.currentThread().getName() + " -> " + name));
    }
}


/*
OUTPUT (Thread Names May Vary):

Sequential Stream:
main -> Alice
main -> Bob
main -> Charlie
main -> David
main -> Eve

Parallel Stream:
main -> Charlie
ForkJoinPool.commonPool-worker-2 -> Alice
main -> Eve
ForkJoinPool.commonPool-worker-2 -> David
ForkJoinPool.commonPool-worker-1 -> Bob
*/
