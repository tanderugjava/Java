package day7;

public class Player {
    private int stamina;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6)
            countPlayers++;
    }

    public int getStamina(){
        return stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }
    public void run() {
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок отдыхает");
        } else {
            stamina -= 1;
            if (stamina == MIN_STAMINA) {
                System.out.println("Игроку требуется отдых");
                countPlayers -= 1;
            }
        }
    }
    public static void info(){
        if(countPlayers < 6){
            switch (countPlayers){
                case 0:
                    System.out.println("Команды неполные. На поле еще есть 6 мест.");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть 5 мест.");
                    break;
                case 2:
                    System.out.println("Команды неполные. На поле еще есть 4 места.");
                    break;
                case 3:
                    System.out.println("Команды неполные. На поле еще есть 3 места.");
                    break;
                case 4:
                    System.out.println("Команды неполные. На поле еще есть 2 места.");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле еще есть 1 место.");
                    break;
            }
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}

