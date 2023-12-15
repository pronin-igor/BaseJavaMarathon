package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Вова", "programming");
        System.out.println((student.getGroupName()));
        Teacher teacher = new Teacher("Игорь", "programming");
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
