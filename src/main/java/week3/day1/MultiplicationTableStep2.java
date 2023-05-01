package week3.day1;

public class MultiplicationTableStep2 {
    public static void main(String[] args) {
        //구구단
        for (int i = 1; i <= 9; i++) {
            System.out.printf("2 * %d = %d\n", i, 2 * i);
        }
        System.out.println("---------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("3 * %d = %d\n", i, 3 * i);
        }
        System.out.println("-------------");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("4 * %d = %d\n", i, 4 * i);
        }
    }
}
