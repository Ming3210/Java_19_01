import java.util.function.Function;

public class B2 {
    public static void main(String[] args) {
        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x + x * 3 +2;
            }
        };
        System.out.println(func.apply(1));
        System.out.println(func.apply(2));
        System.out.println(func.apply(3));
    }
}
