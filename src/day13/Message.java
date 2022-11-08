package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return this.sender;
    }

    public User getReceiver() {
        return this.receiver;
    }

    public String getText() {
        return this.text;
    }

    public Date getDate() {
        return this.date;
    }

    public String toString() {
        return "From: '" + sender.getUsername() +
                "'\nTo: '" + this.receiver.getUsername() +
                "'\nOn: " + this.getDate() +
                "\n'" + this.getText() + "'\n\n";
    }
}
