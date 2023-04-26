package week2.day8;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2]; //.배열의 초기화
        students[0] = new Student(); //Student 클래스의 초기화
        students[0].name = "김경록";
        students[0].phoneNumber = "010-1111-2222";
        students[0].age = "37";
        students[1].name = "김지유";
        students[1].phoneNumber = "010-2222-3333";
        students[1].age = "2";

        class Student{
            String name;
            String phoneNumber;
            int age;
        }
    }
}
