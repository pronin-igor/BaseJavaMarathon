package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User>subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<User>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {

    }

    public boolean isSubscribed(User user) {
        return true;
    }

    public boolean isFriend(User user) {
        return true;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return username;
    }

    public boolean equals(User user) {
        return (username == user.username);
    }
}

