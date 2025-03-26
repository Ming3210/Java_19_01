package B7;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5,-2,10,0,-7,-3);

        Predicate<Integer> isNegative = num -> num < 0;

        ListProcessor processor = list -> list.stream().anyMatch(isNegative);

        System.out.println("Danh sách số:");
        ListProcessor.printList(numbers);

        boolean hasNegative = processor.containsNegative(numbers);
        if(hasNegative){
            System.out.println("Danh sách chứa số âm");
        }
        else {
            System.out.println("Danh sách không chứa số âm");
        }

    }
}
