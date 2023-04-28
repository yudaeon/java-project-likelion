package codeup;

import java.util.Scanner;

public class codeup1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();

        if (val1 >= 90){
            System.out.println("A");
        }
            else if (val1 >=70) {
            System.out.printf("B");
        }
            else if (val1 >=40) {
             System.out.printf("C");
            }
            else if (val1 >= 0) {
            System.out.printf("D");}
    }}