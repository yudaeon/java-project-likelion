package babylion;

import java.util.concurrent.ForkJoinPool;

public class PrintStarts {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <  i ; k++)   System.out.printf(" "); //공백 출력
            for (int j = 5; j > i ; j--)    System.out.printf("*"); //별출력
            System.out.println(); //줄넘김
        }
    }
}

