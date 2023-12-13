package day6;

public class Teacher {
    private String name = "";
    private String schoolSubject = "";

    public Teacher(String name, String schoolSubject) {
        this.name = name;
        this.schoolSubject = schoolSubject;
    }

    public void evaluate(Student student) {
        int mark = (int) (Math.random() * (5 - 2) + 2);
        String strMark = "";
        switch (mark) {
            case 2:
                strMark = "неудовлетворительно";
                break;
            case 3:
                strMark = "удовлетворительно";
                break;
            case 4:
                strMark = "хорошо";
                break;
            case 5:
                strMark = "отлично";
                break;
        
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + schoolSubject +" на оценку " + strMark);
    }
}
