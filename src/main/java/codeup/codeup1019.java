package codeup;

import java.util.Scanner;
public class codeup1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("\\.");

        int val1 = Integer.valueOf(arr[0]);
        int val2 = Integer.valueOf(arr[1]);
        int val3 = Integer.valueOf(arr[2]);

        System.out.printf("%04d.%02d.%02d",val1,val2,val3);
    }
}
