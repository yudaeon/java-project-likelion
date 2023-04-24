package codeup;

import java.util.Scanner;

public class codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.next();
        String[] val2 = val1.split("\\.");
        System.out.printf("%s\n%s", val2[0],val2[1]);
    }
}
