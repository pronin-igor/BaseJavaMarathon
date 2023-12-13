package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Вася");
        Teacher teacher = new Teacher("Петя", "математика");
        teacher.evaluate(student);
    }
}
