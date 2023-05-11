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

        private boolean isExist(Student pstudent) { //private 내부에서만 처리하도록
            //중복 여부 check
            for (Student student : students) {
                if (pstudent.getCode().equals(student.getCode())) return true;
            }
            return false;
        }

        private void addAStuent(Student student){
            if (!isExist(student)){ //중복이 제거되지 않은 것에 추가
             students.add(student);
            }
        }
        private void deleteStudent(Student pStudent){
            for (int i = 0; i < students.size(); i++) {
              if (isExist(students.get(i))) students.remove(i);
            }
        }

        public void process(Student pStudent){
            switch (pStudent.getCode()){
                case "I" -> addAStuent(pStudent);
                case "D" -> deleteStudent(pStudent);
            }
        }

        private void printStudents(){
            for (Student student:
                 students) {
                System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
            }
        }

        public static void main(String[] args) {
            int size = 1;
            String[] splitted = "I 1011 한라산".split(" ");

            codeup3108 codeup3108 = new codeup3108();
            Student student = codeup3108.makeAStudent(splitted[0], String.valueOf(Integer.parseInt(splitted[1])), splitted[2]);
            codeup3108.process(student);
            codeup3108.printStudents();

        }
}
