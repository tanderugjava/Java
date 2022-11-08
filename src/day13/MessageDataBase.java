package day13;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MessageDataBase {
    private static List<Message> messages = new ArrayList();
    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message messege: messages) {
                if (u1 == messege.getSender() && u2 == messege.getReceiver()) {
                    System.out.println(u1.getUsername() + " :" + messege.getText());

                } else if (u2 == messege.getSender() && u1 == messege.getReceiver()) {
                    System.out.println(u2.getUsername() + " :" + messege.getText());
;                 }
        }
    }
}
