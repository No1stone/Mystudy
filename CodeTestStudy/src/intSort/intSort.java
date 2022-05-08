package intSort;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class intSort {
    public static void main(String[] args) {
        int[] s = {5,2,3,4,1};

        var a = Arrays.stream(s).sorted().toArray();

        for(int e : a){

            System.out.println(e);

        }
    }
}
