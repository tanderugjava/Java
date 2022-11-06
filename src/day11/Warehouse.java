package day11;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse (){
      this.countPickedOrders = countPickedOrders;
      this.countDeliveredOrders = countDeliveredOrders;
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
    public void incrementCountDeliveredOrders(){
        countDeliveredOrders++;
    }
    public void incrementCountPickedOrders(){
        countPickedOrders++;
    }

}
