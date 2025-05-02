import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> number =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> isEven= EvenNumberFilter.filterEvenNumbers(number);
        System.out.println("Original list: " + number);
        System.out.println("Even numbers: " + isEven);
        System.out.println();

        //  List with only odd numbers
        List<Integer> numbers1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> evens3 = EvenNumberFilter.filterEvenNumbers(numbers1);
        System.out.println("Original List: " + numbers1);
        System.out.println("Even Numbers List: " + evens3);

    }
}