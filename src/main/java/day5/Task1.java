package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("mazda");
        System.out.println(car.getModel());

        Motorbike motorbike = new Motorbike("racer", "black", 2016);
        System.out.println("Motorbike - "+motorbike.model+" "+motorbike.color+" "+motorbike.issueYear);
    }
}
