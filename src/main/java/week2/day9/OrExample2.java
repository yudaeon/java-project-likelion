package week2.day9;

public class OrExample2 {
    public static void main(String[] args) {
        int yearOfExp = 8;
        int numOfProj = 12;

        boolean isPromotion = yearOfExp > 5 || numOfProj > 10;

        System.out.printf("팀장 승진 여부: %b", isPromotion);
    }
}
