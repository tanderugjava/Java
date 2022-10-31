package day11;

public class Picker extends Warehouse implements Worker  {
    int salary;
    boolean isPayed;

    public Picker(String name){
        super(name);
        this.salary = 0;
        this.isPayed = false;
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
    public void do_work() {
        salary += 80;
        countPickedOrders ++;

    }

    @Override
    public void bonus() {
        if(!isPayed && countPickedOrders == 10000){
            salary += 70000;
            isPayed = true;
        } else if (countPickedOrders < 10000){
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }

    }
}
