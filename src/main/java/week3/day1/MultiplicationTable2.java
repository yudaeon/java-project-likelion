package week3.day1;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        int[]dan = {2, 4, 8, 9};
        for (int i = 0; i < dan.length; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", dan[i], j, j * dan[i]);
            }
            System.out.println("-------------------------");
        }
        }
    }
