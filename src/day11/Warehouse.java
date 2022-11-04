package day11;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;
    private String name;

    public Warehouse (String name){
        this.name = name;
        this.countPickedOrders = getCountPickedOrders();
    }

    public int getCountPickedOrders(){
        return countPickedOrders;
    }

    public void setCountPickedOrders(int a){
        countPickedOrders += a;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return ("Собранных заказов " + countPickedOrders + "\n" + "Доставленных заказов " + countDeliveredOrders);
    }
    public void countDeliveredOrdersPlus(){
        countDeliveredOrders++;
    }
    public void countPickedOrdersPlus(){
        countPickedOrders++;
    }

}
