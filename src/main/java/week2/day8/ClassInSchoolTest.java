package week2.day8;

public class ClassInSchoolTest {
    public static void main(String[] args) {
    ClassInSchool classInSchool = new ClassInSchool();
    classInSchool.no = 1;
    classInSchool.teacher = new Teacher();
    classInSchool.students = new Student[30];
    classInSchool.teacher.name = "김미미";
    classInSchool.teacher.age = 30;
    classInSchool.teacher.address = "경기도 광주시";

        System.out.println("classInSchool.teacher.name = " +classInSchool.teacher.name);
    }
}
