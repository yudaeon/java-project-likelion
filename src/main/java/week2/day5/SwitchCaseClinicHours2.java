package week2.day5;

import java.util.Scanner;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "월";
        String time = "휴진";
        switch (day){
            case "월","화","수","목","금","토": time = "09:30-18:30";
            case "일" : time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
