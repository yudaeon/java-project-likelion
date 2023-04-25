package codeup;

import java.util.Scanner;

public class codeup1027 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            String val1 = sc.next();
            String[] val2 = val1.split("\\.");
            System.out.println(val2[2] + "-" + val2[1] + "-" + val2[0]);
        }
    }