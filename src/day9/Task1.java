package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "Group1");
        Teacher teacher = new Teacher("Mark", "Java");
        student.printInfo();
        teacher.printInfo();
    }
}
