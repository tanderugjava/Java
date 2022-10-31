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
        courier1.do_work();
        System.out.println(courier1.getCountDeliveredOrders());
        System.out.println(courier.getCountDeliveredOrders()); // работает, но переменные в классах не приватные, с наскока поменять не получилось


    }
    public static void businessProcess(Worker worker){
        for(int i = 0; i < 10000; i++){
            worker.do_work();
        }
        worker.bonus();
    }
}
