package exame2;

import java.util.stream.Stream;

public class flatmap {

     public static void main(String[] args) {
         Stream.iterate(10, i -> 1+i)
                 .skip(10)
                 .limit(10)
                 .forEach(System.out::println);

    }
}
