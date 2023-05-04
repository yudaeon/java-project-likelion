package codeup;

import java.util.Scanner;

public class codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int num[] = new int[val1];

        for (int i = 0; i < val1; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = val1-1; i >=0 ; i--) {
            System.out.print(num[i]+" ");
        }
        }
    }
