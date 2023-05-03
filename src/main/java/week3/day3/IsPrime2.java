package week3.day3;

import java.util.zip.ZipFile;
public class IsPrime2 {
    public static void main(String[] args) {
        // 2부터 n - 1 까지만 check
        //i * i < 50
        //break; num % 1 == 0이면

        //15
        int num = 991; //소수 2_500_000
        boolean isPrime = true;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) break;
            break;
        }
        System.out.println(num);
    }
}


