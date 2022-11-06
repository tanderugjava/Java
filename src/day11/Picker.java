package day11;

public class Picker implements Worker  {
    private int salary;
    private boolean isPayed;

    private Warehouse warehouse;
    private static final int MONTHLY_SALARY = 80;
    private static final int QUANTITY_PICKED_ORDERS_FOR_BONUS = 10000;
    private static final int BONUS = 70000;


    public Picker(Warehouse warehouse){
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
        warehouse.incrementCountPickedOrders();;
    }

    @Override
    public void bonus() {
        if(!isPayed && warehouse.getCountPickedOrders() == QUANTITY_PICKED_ORDERS_FOR_BONUS){
            salary += BONUS;
            isPayed = true;
        } else if (warehouse.getCountPickedOrders() < QUANTITY_PICKED_ORDERS_FOR_BONUS){
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
