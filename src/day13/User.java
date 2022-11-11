package day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions = new ArrayList();

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public List<User> getSubscriptions() {
        return this.subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user)&& user.getSubscriptions().contains(this);
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString() {
        return "username='" + this.username + "'";
    }
}
