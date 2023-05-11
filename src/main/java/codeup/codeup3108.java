package codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String code;
    private String testId;
    private String name;


    public Student(String code, String testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public String getTestId() {
        return testId;
    }
    public String getName() {
        return name;
    }
}

    public class codeup3108 {
        private List<Student> students = new ArrayList<>();

        public Student makeAStudent(String code, String testId, String name) {
            return new Student(code, testId, name);
        }

        public boolean isDuplicated(Student pstudent) {
            //중복여부check
            for (Student student : students) {
                if (pstudent.getCode().equals(student.getCode())) return false;
            }
            return true;
        }

            //중복 check를 한 후 넣는다.
//---------------makeAStudent, isDuplicated--------------

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int size = 1;
            String[]splitted = "I 1011 한라산".split(" ");
            codeup3108 codeup3108 = new codeup3108();
            Student student = codeup3108.makeAStudent(splitted[0], splitted[1], splitted[2]);
            System.out.println(student.getCode());
            System.out.println(student.getTestId());
            System.out.println(student.getName());
        }
}
