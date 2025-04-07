import java.util.List;
import java.util.stream.Stream;

class Stream04reduceMethod {
	public static void main(String[] args) {
		

		List<Integer> num1 = List.of(1, 2, 3, 4, 5);
        // Using reduce() to find sum
        int sum = num1.stream().reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);		// Sum: 15


        List<Integer> num2 = List.of(3, 9, 2, 7, 5);
        // Find max value
        int max = num2.stream().reduce(Integer.MIN_VALUE, Integer::max);
  
        System.out.println("Maximum Value: " + max);  // Maximum Value: 9


        List<Integer> num3 = List.of(3, 9, 2, 7, 5);
        // Find min value
        int min = num3.stream().reduce(Integer.MAX_VALUE, Integer::min);
  
        System.out.println("Minimum Value: " + min);  // Minimum Value: 2
	}
}