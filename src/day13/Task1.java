package day13;

public class Task1 {
    public static void main(String[] args) {
            User user1 = new User("Sam");
            User user2 = new User("Bob");
            User user3 = new User("Tom");
            user1.sendMessage(user2, "Привет, " + user2.getUsername() + "!");
            user1.sendMessage(user2, "Как дела?");
            user2.sendMessage(user1, "Привет!");
            user2.sendMessage(user1, "У меня все хорошо!");
            user2.sendMessage(user1, "Ты давно видел " + user3.getUsername() + "?");
            user3.sendMessage(user1, "Привет, " + user1.getUsername() + "!");
            user3.sendMessage(user1, "Я здесь!");
            user3.sendMessage(user1, "Давно не появлялся тут, т.к. был в отпуске)");
            user1.sendMessage(user3, "Рад, что у тебя все хорошо!");
            user1.sendMessage(user3, "Мы скучали =)");
            user1.sendMessage(user3, "Как отдохнул?");
            user3.sendMessage(user1, "Прекрасно, спасибо!");
            MessageDataBase.showDialog(user1, user3);

            System.out.println(user1.isSubscribed(user2));
            user1.subscribe(user2);
            System.out.println(user1.isSubscribed(user2));
            System.out.println(user1.isFriend(user2));
            user2.subscribe(user1);
            System.out.println(user1.isFriend(user2));



            /*System.out.println(MessageDataBase.getMessages());*/
        }
    }

