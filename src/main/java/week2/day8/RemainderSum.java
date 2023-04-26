package week2.day8;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int firstremainder  = num % 10;
        num = num / 10;
        int secondremainder  = num % 10;
        num = num / 10;
        int thirdremainder  = num % 10;

        System.out.println(firstremainder + secondremainder + thirdremainder);
    }
}
