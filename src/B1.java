import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Java", "", "Lambda", "Stream", "", "Functional"};


        List<String> result = Arrays.stream(arr).filter(Predicate.not(String::isEmpty)).collect(Collectors.toList());

        System.out.println(result);
    }
}
