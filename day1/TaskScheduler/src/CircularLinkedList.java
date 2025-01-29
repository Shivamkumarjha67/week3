class CircularLinkedList {
    private Task head;

    public CircularLinkedList() {
        this.head = null;
    }

    // Function to add a task at the beginning of the list
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);

        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            newTask.next = head;
            Task last = getLastNode();
            last.next = newTask;
            head = newTask;
        }
    }

    // Function to add a task at the end of the list
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
        } else {
            Task last = getLastNode();
            last.next = newTask;
            newTask.next = head;
        }
    }

    // Function to add a task at a specific position in the list
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position <= 0) {
            addAtBeginning(taskId, taskName, priority, dueDate);
        } else {
            Task current = head;
            int count = 0;
            while (count < position - 1 && current.next != head) {
                current = current.next;
                count++;
            }
            newTask.next = current.next;
            current.next = newTask;
        }
    }

    // Function to remove a task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            return;
        }

        Task current = head;
        Task prev = null;

        // Find the task with given Task ID
        do {
            if (current.taskId == taskId) {
                if (prev == null) {
                    Task last = getLastNode();
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Function to view the current task and move to the next task
    public Task viewAndMoveToNext() {
        if (head == null) {
            return null;
        }
        Task current = head;
        head = head.next; // Move head to the next task
        return current;
    }

    // Function to display all tasks starting from the head node
    public void displayTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }
        Task current = head;
        do {
            System.out.println("Task ID: " + current.taskId +
                    ", Task Name: " + current.taskName +
                    ", Priority: " + current.priority +
                    ", Due Date: " + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Function to search for a task by Priority
    public Task searchByPriority(int priority) {
        if (head == null) {
            return null;
        }
        Task current = head;
        do {
            if (current.priority == priority) {
                return current;
            }
            current = current.next;
        } while (current != head);

        // Task with given priority not found
        return null;
    }

    // Helper function to get the last node in the list
    private Task getLastNode() {
        Task current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }
}
