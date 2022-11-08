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
        boolean status = false;
        Iterator var3 = this.subscriptions.iterator();

        while(var3.hasNext()) {
            User name = (User)var3.next();
            if (name == user) {
                status = true;
            }
        }

        return status;
    }

    public boolean isFriend(User user) {
        boolean friend = false;
        if (this.isSubscribed(user) && user.isSubscribed(this)) {
            friend = true;
        }

        return friend;
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString() {
        return "username='" + this.username + "'";
    }
}
