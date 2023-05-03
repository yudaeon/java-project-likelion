package week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstremainder  = num % 10;
        num = num / 10;
        int secondremainder  = num % 10;
        num = num / 10;
        int thirdremainder  = num % 10;
       //21 출력
        System.out.println(firstremainder + secondremainder + thirdremainder);
    }
}
