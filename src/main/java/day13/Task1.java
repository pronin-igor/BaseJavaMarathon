package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Gosha");
        User user2 = new User("Andrey");
        User user3 = new User("Misha");

        user1.sendMessage(user2, "message 1");
        user1.sendMessage(user2, "message 2");

        user2.sendMessage(user1, "message 3");
        user2.sendMessage(user1, "message 4");
        user2.sendMessage(user1, "message 5");

        user3.sendMessage(user1, "message 6");
        user3.sendMessage(user1, "message 7");
        user3.sendMessage(user1, "message 8");

        user1.sendMessage(user3, "message 9");
        user1.sendMessage(user3, "message 10");
        user1.sendMessage(user3, "message 11");

        user3.sendMessage(user1, "message 12");
        // for (Message message: MessageDatabase.getMessages()) {
        //     System.out.println(message);
        //     System.out.println();
        // }

        MessageDatabase.showDialog(user1, user3);
    }
}
