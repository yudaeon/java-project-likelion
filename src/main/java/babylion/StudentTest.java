package babylion;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student("유다언", 26);
        System.out.println(student2.age);
        student.study(5);
        student.isAdult();
    }
}
