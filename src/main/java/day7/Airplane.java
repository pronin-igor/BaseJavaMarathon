package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year= year;
        this.length = length;
        this.weight = weight;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: "+this.manufacturer+", год выпуска: "+this.year+", длина: "+this.length+", вес: "+this.weight+", количество топлива в баке: "+this.fuel);
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public static void compareAirplanes(Airplane a, Airplane b) {
        if (a.length > b.length) {
            System.out.println("Первый самолет длиннее");
        } else if (a.length < b.length) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
