package day6;

public class Car {
    public String model;
    public String color;
    public int issueYear;

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        return Math.abs(year - this.issueYear);
    }
}
