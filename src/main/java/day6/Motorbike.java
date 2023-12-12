package day6;

public class Motorbike {
    public String model;
    public String color;
    public int issueYear;

    public Motorbike(String model, String color, int issueYear) {
        this.model = model;
        this.color = color;
        this.issueYear = issueYear;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
        return Math.abs(year - this.issueYear);
    }
}
