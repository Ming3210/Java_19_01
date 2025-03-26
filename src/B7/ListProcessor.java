package B7;

import java.util.List;

public interface ListProcessor {
    boolean  containsNegative(List<Integer> list);
    static void printList(List<Integer> list){
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
