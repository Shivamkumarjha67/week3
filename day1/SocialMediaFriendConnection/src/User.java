class User {
    int userId;
    String name;
    int age;
    Friend friendList;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendList = null;
        this.next = null;
    }

    // **Add a friend to the user's friend list**
    public void addFriend(int friendId) {
        Friend newFriend = new Friend(friendId);
        if (friendList == null) {
            friendList = newFriend;
        } else {
            Friend temp = friendList;
            while (temp.next != null) {
                if (temp.friendId == friendId) return;  // Avoid duplicate connections
                temp = temp.next;
            }
            if (temp.friendId != friendId) temp.next = newFriend;
        }
    }

    // **Remove a friend from the user's friend list**
    public void removeFriend(int friendId) {
        if (friendList == null) return;

        if (friendList.friendId == friendId) {
            friendList = friendList.next;
            return;
        }

        Friend prev = friendList, current = friendList.next;
        while (current != null) {
            if (current.friendId == friendId) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // **Display the user's friend list**
    public void displayFriends() {
        System.out.print("Friends of " + name + " (User ID: " + userId + "): ");
        Friend temp = friendList;
        if (temp == null) {
            System.out.println("No friends yet.");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // **Count the number of friends**
    public int countFriends() {
        int count = 0;
        Friend temp = friendList;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}