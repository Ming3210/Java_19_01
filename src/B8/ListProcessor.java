package B8;

import java.util.List;

public interface ListProcessor {
    void sumOddNumbers(List<Integer> list);
    static void printList(List<Integer> list){
        for(Integer num : list){
            System.out.print(num + " ");
        }
        System.out.println();
    }


    default boolean checkOdd(List<Integer> list){
        for(Integer num : list){
            if(num % 2 == 0) return false;
        }
        return true;
    };
}
