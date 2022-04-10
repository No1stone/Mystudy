package exame1;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class exame {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("a");
        name.add("b");
        name.add("c");
        name.add("d");

//        name.forEach(System.out::println);
        System.out.println("====================");

        Spliterator<String> spliter = name.spliterator();
        Spliterator<String> spliter1 = spliter.trySplit();

        while(spliter.tryAdvance(System.out::println));

        System.out.println("====================");
        while (spliter1.tryAdvance(System.out::println));


        }

}
