package week2.day5;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAudult = age >= 18;
        if (isAudult) {
            System.out.println("성인입니다.");
        }
        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
    }
}