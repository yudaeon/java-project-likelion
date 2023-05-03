package week3.day3;

import java.util.zip.ZipFile;

public class IsPrime2 {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0;
        for (int i = 0; i < num; i++) {
            if (num % i == 0){
                factors++;
            }
        }
        System.out.println("factors:" + factors );
        System.out.println(factors == 0);
    }
}
