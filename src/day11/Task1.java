package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse("seaPort");
        Picker picker = new Picker("seaPort");
        Courier courier = new Courier("seaPort");
        Warehouse warehouse1 = new Warehouse("chemical");
        Picker picker1 = new Picker("chemical");
        Courier courier1 = new Courier("chemical");


        businessProcess(picker);
        businessProcess(courier);

        System.out.println(picker.getCountPickedOrders());
        System.out.println(picker);
        System.out.println(courier.getCountDeliveredOrders());
        System.out.println(courier);
        courier1.doWork();
        System.out.println(courier1.getCountDeliveredOrders());
        System.out.println(courier.getCountDeliveredOrders());


    }
    public static final int QUANTITY_FOR_BONUS = 10000;
    public static void businessProcess(Worker worker){
        for(int i = 0; i < QUANTITY_FOR_BONUS; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}
