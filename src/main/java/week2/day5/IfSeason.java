package week2.day5;

public class IfSeason {
    public static void main(String[] args) {
        int month = 13; //month 11월
        if (month == 12 || month ==1 || month ==2){
            System.out.println("겨울"); //12,1,2월은 겨울
        } else if (month == 3 || month ==4 || month == 5) {
            System.out.println("봄");
        } else if (month == 6 || month == 7 || month ==8) {
            System.out.println("여름");
        } else if (month == 9 || month == 10 || month == 11){
            System.out.println("가을");
        } else{
            System.out.println("해당하는 계절이 없습니다.");
        }
    }
}
