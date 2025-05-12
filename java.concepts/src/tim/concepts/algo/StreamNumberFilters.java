package tim.concepts.algo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamNumberFilters {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Filter out even numbers
            List<Integer> evenNumbers = numbers.stream()
                    .filter(number -> number % 2 == 0).toList();

            System.out.println("Even numbers: " + evenNumbers); // Output: Even numbers: [2, 4, 6, 8, 10]

            // Filter out numbers greater than 5
            List<Integer> numbersGreaterThanFive = numbers.stream()
                    .filter(number -> number > 5).toList();

            System.out.println("Numbers greater than 5: " + numbersGreaterThanFive); // Output: Numbers greater than 5: [6, 7, 8, 9, 10]


            // Filter out numbers greater than 5, and even numbers
            List<Integer> evenNumbersGreaterThanFive = numbers.stream()
                    .filter(number -> number > 5)
                    .filter(number -> number % 2 == 0).toList();

            System.out.println("Even numbers greater than 5: " + evenNumbersGreaterThanFive); // Output: Even numbers greater than 5: [6, 8, 10]

            // Example with Strings
            List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

            // Filter names that start with "A"
            List<String> namesStartingWithA = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());

            System.out.println("Names starting with 'A': " + namesStartingWithA); // Output: Names starting with 'A': [Alice]
        }
    }
