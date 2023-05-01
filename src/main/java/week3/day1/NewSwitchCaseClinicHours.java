package week3.day1;

public class NewSwitchCaseClinicHours {
    public static void main(String[] args) {
        String  day =  "월";
        String time = "휴진";
        switch (day){
        case "월", "화", "수", "목", "금", "토" -> System.out.printf ("09:00-19:00") ;
    case "일" -> System.out.printf("휴진");
            default -> throw new IllegalArgumentException("해당하는 요일은 없습니다." + day);
    } }}

