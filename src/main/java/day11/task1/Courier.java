package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private Boolean isPayed = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public Boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return ("заработная плата " + salary + ", был выплачен бонус или нет " + isPayed);
    }

    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        
        if (warehouse.getCountDeliveredOrders() != 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        salary += 50000;
        isPayed = true;
    }
}
