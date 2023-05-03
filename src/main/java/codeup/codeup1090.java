package codeup;

import java.util.Scanner;
//등비수열
public class codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        long result = val1 * (long) Math.pow(val2, (val3 - 1));
        System.out.println(result);

    }
}
