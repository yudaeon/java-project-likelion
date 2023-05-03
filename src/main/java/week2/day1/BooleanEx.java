package week2.day1;

public class BooleanEx {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = true;

        boolean isPaymentSuccess = true;
        boolean isBalanceSufficient = false;

        System.out.println(isPaymentSuccess);
        System.out.println(isBalanceSufficient);

        int age = 37;
        boolean isAdult = age >= 18;
        System.out.println("isAdult = " + isAdult); // true
        boolean isChild = age <18;
        System.out.println("isChilds = " + isChild); //false
    }
}
