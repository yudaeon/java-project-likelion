package codeup;

import java.util.Scanner;

public class coduep1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = 0;

        for (int i = 1; i <= val1; i++) {
            val2 = val2 + i;
                if (val2 >= val1){
                    break;
            }
        }
        System.out.println(val2);
    }
}
