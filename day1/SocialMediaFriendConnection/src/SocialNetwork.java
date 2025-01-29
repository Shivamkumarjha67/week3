class SocialNetwork {
    private User head;

    // Add a new user**
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newUser;
        }
    }

    // Find a user by User ID**
    private User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Find a user by Name**
    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add a friend connection between two users**
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null && userId1 != userId2) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
        }
    }

    // Remove a friend connection**
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
        }
    }

    // Find mutual friends between two users**
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        System.out.print("Mutual friends of " + user1.name + " and " + user2.name + ": ");
        Friend f1 = user1.friendList;
        while (f1 != null) {
            Friend f2 = user2.friendList;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    break;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    // Display all friends of a specific user**
    public void displayUserFriends(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            user.displayFriends();
        } else {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user**
    public void countAllFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.countFriends() + " friends.");
            temp = temp.next;
        }
    }
}