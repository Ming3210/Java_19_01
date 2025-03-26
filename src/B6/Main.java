package B6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("java","lambda","stream","functional");
        StringProcessor processor = (input) -> input.toUpperCase() + " - TECHNICAL";

        List<String> newList = new ArrayList<>();
        for(String l : list) {
            newList.add(processor.processString(l));
        }

        processor.printList(newList);
    }

}
