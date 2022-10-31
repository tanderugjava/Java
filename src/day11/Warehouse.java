package day11;

public class Warehouse {
    int countPickedOrders;
    int countDeliveredOrders;
    String name;

    public Warehouse (String name){
        this.name = name;
        this.countPickedOrders = 0;
    }

    public int getCountPickedOrders(){
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return ("Собранных заказов " + countPickedOrders + "\n" + "Доставленных заказов " + countDeliveredOrders);
    }
}
