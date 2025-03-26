import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class B5 {
    public static void main(String[] args) {
        String[] arr =  new String[]{"Alice", "Andrew", "Bob", "Anna", "Charles"};
        AtomicInteger count = new AtomicInteger();
        List<String> list = List.of(arr);

        list.forEach(a -> {
            if(a.length() >=5 && a.charAt(0) == 'A'){
                count.getAndIncrement();
            }
        });

        System.out.println(count);
    }
}
