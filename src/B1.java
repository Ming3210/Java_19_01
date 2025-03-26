import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class B1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Java", "", "Lambda", "Stream", "", "Functional"};

        List<String> str = List.of(arr);
        List<String> newStr = new ArrayList<>();

        Predicate<String> isNull = strings -> strings != "";

        for (String s : str){
            if (isNull.test(s)) {
                newStr.add(s);
            }
        }

        System.out.println(newStr);

    }
}
