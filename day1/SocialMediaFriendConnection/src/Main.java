public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        // Adding users
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 27);
        network.addUser(3, "Charlie", 24);
        network.addUser(4, "David", 30);

        // Adding friend connections
        network.addFriendConnection(1, 2);
        network.addFriendConnection(1, 3);
        network.addFriendConnection(2, 3);
        network.addFriendConnection(3, 4);

        // Display friends
        network.displayUserFriends(1);
        network.displayUserFriends(2);
        network.displayUserFriends(3);
        network.displayUserFriends(4);

        // Find mutual friends
        network.findMutualFriends(1, 2);
        network.findMutualFriends(2, 3);

        // Remove a friend connection
        System.out.println("\nRemoving Bob and Charlie's friendship...");
        network.removeFriendConnection(2, 3);
        network.displayUserFriends(2);
        network.displayUserFriends(3);

        // Count all friends
        System.out.println("\nFriend count:");
        network.countAllFriends();
    }
}