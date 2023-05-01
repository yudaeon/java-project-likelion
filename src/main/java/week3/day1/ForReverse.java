package week3.day1;

public class ForReverse {
    public static void main(String[] args) {
        //세로 역순
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d\n", i);
        }
        //가로역순
        for (int i = 10; i > 0; i--) {
            System.out.printf("%d", i);
        }
        System.out.println();
        //10~0까지 가로역순
        for (int i = 10; i >= 0; i--) {
            System.out.printf("%d", i);
        }
    }
}
