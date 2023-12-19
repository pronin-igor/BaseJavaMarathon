package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker picker = new Picker(warehouse);
        Worker courier = new Courier(warehouse);
        businessProcess(picker);
        System.out.println(((Picker)picker).getSalary());
        businessProcess(courier);
        System.out.println(((Courier)courier).getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
