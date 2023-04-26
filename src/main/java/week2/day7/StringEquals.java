package week2.day7;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD"); //true출력 , 메모리 주소끼리 비교하기 때문에 같다고 나오는 것
        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD"+ str1.hashCode());
        System.out.println("G-->"+ str2.hashCode());


        boolean isSame = str1.substring(0, 1) == str2;
        isSame = str1.substring(0,1).equals(str2);
        System.out.println(isSame); //false 출력

    }
}
