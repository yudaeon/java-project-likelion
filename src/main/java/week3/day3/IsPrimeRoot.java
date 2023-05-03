package week3.day3;

import java.util.Scanner;

public class IsPrimeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0; //약수의 개수
        for (int i = 2; i * i <= num ; i++) {  //i*i는 루트
            if (num % i == 0) factors++; //factors =1
        }
        System.out.println(factors == 0 ? num + "prime" : "not prime");
    }
    }

