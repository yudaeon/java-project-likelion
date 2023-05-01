package week3.day1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 1;
        int lastDate = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("해당월은 없습니다. 입력월:" + month);
        };
          System.out.printf("%d월은 %d일 까지 있습니다.", month, lastDate);
    }
}
