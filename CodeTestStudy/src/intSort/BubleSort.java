package intSort;

import java.util.Scanner;

public class BubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 크기입력");
        int N = sc.nextInt();
        int A[] = new int[N];
        System.out.println("배열의 크기=" + N);
        for (int i = 0; i < N; i++) {
            System.out.println(i +1 +"/"+N+ "번쨰 값 입력");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int e : A){
            System.out.println(e);
        }

    }
}
