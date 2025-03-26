package B8;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Predicate<Integer> isOdd = num -> num % 2 != 0;

        System.out.print("Danh sách số: ");
        ListProcessor.printList(numbers);

        ListProcessor processor = list -> {
            int sum = 0;
            for (Integer num : list) {
                if (isOdd.test(num)) {
                    sum += num;
                }
            }
            System.out.println("Tổng các số lẻ: " + sum);
        };
        processor.sumOddNumbers(numbers);

    }
}
