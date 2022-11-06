package day11;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private static final int MONTHLY_SALARY = 100;
    private static final int QUANTITY_DELIVERED_ORDERS_FOR_BONUS = 10000;
    private static final int BONUS = 50000;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;

    }

    public int getSalary(){
        return salary;
    }

    public boolean getIsPayed(){
        return isPayed;
    }

    public String toString(){
        return ("Заработная плата " + salary + "\n" + "Бонус выплачен? - " + isPayed);
    }

    @Override
    public void doWork() {
        salary += MONTHLY_SALARY;
        warehouse.incrementCountDeliveredOrders();
    }

    @Override
    public void bonus() {
        if(!isPayed && warehouse.getCountDeliveredOrders() == QUANTITY_DELIVERED_ORDERS_FOR_BONUS){
            salary += BONUS;
            isPayed = true;
        } else if (warehouse.getCountDeliveredOrders() < QUANTITY_DELIVERED_ORDERS_FOR_BONUS){
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
