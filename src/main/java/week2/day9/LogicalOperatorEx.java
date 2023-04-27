package week2.day9;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = false;

        if(age >= 18 && !isStudent){ //논리 연산자 && 두개다 참이여야한다.
            System.out.println("성인이며 학생이 아닙니다.");
        }else
            System.out.println("학생입니다.");
    }
}
