package codeup;

import java.util.Scanner;

public class codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val1 = sc.nextLine();
        String[]arr = val1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i].equals("q"))
                break;
        }
    }
}
