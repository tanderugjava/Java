package day7;

import java.util.Random;

import static day7.Player.MIN_STAMINA;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(90,101));
        Player player2 = new Player(random.nextInt(90,101));
        Player player3 = new Player(random.nextInt(90,101));
        Player player4 = new Player(random.nextInt(90,101));
        Player player5 = new Player(random.nextInt(90,101));
        Player player6 = new Player(random.nextInt(90,101));
        Player player7 = new Player(random.nextInt(90,101));
        System.out.println(Player.getCountPlayers());
        Player.info();
        for(int i = player1.getStamina(); i > MIN_STAMINA; i--){
            player1.run();
        }
        for(int i = player2.getStamina(); i > MIN_STAMINA; i--){
            player2.run();
        }
        for(int i = player3.getStamina(); i > MIN_STAMINA; i--){
            player3.run();
        }
        Player.info();
    }
}
