package week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAudult = userAge >= 18;
        System.out.printf("미성년자 입니까? %b",!isAudult);
    }
}
