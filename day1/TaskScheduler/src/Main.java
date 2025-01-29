public class Main {
    public static void main(String[] args) {
        CircularLinkedList taskList = new CircularLinkedList();

        // Adding tasks
        taskList.addAtEnd(1, "Task A", 4, "2025-01-30");
        taskList.addAtEnd(2, "Task B", 3, "2025-01-31");
        taskList.addAtEnd(3, "Task C", 2, "2025-01-29");

        // Display all tasks
        System.out.println("All Tasks:");
        taskList.displayTasks();

        // Removing a task by Task ID
        taskList.removeByTaskId(2);

        // Display all tasks after removal
        System.out.println("\nTasks after removing Task ID 2:");
        taskList.displayTasks();

        // Viewing current task and moving to the next
        Task currentTask = taskList.viewAndMoveToNext();
        if (currentTask != null) {
            System.out.println("\nViewing current task:");
            System.out.println("Task ID: " + currentTask.taskId +
                    ", Task Name: " + currentTask.taskName +
                    ", Priority: " + currentTask.priority +
                    ", Due Date: " + currentTask.dueDate);
        }

        // Searching for a task by Priority
        int priorityToSearch = 3;
        Task foundTask = taskList.searchByPriority(priorityToSearch);
        if (foundTask != null) {
            System.out.println("\nTask found with Priority " + priorityToSearch + ":");
            System.out.println("Task ID: " + foundTask.taskId +
                    ", Task Name: " + foundTask.taskName +
                    ", Priority: " + foundTask.priority +
                    ", Due Date: " + foundTask.dueDate);
        } else {
            System.out.println("\nNo task found with Priority " + priorityToSearch);
        }
    }
}
