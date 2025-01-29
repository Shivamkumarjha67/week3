class RoundRobinScheduler {
    private Process head = null;
    private Process tail = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // **1. Add a new process at the end of the circular list**
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head;  // Circular link
        } else {
            tail.next = newProcess;
            newProcess.next = head;  // Circular link
            tail = newProcess;
        }
    }

    // **2. Remove a process by Process ID after execution**
    private void removeProcess(int processId) {
        if (head == null) return;

        Process current = head, prev = null;
        do {
            if (current.processId == processId) {
                if (current == head && current == tail) {  // Only one process left
                    head = tail = null;
                } else if (current == head) {
                    // Removing head
                    tail.next = head.next;
                    head = head.next;
                } else if (current == tail) {
                    // Removing tail
                    prev.next = head;
                    tail = prev;
                } else {
                    // Removing middle process
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Simulate the round-robin scheduling**
    public void executeProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        int time = 0;
        int totalProcesses = countProcesses();
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        System.out.println("Starting Round-Robin Scheduling (Time Quantum = " + timeQuantum + ")");
        Process current = head;

        while (head != null) {
            System.out.println("\nExecuting Process ID: " + current.processId);
            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                time += timeQuantum;
            } else {
                time += current.remainingTime;
                // Turnaround time = completion time
                totalTurnaroundTime += time;
                // Waiting time = turnaround time - burst time
                totalWaitingTime += (time - current.burstTime);
                removeProcess(current.processId);
            }

            // If all processes are executed
            if (head == null) break;

            current = current.next;
            // Display remaining processes
            displayProcesses();
        }

        // Calculate and display average waiting time and turnaround time**
        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / totalProcesses);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / totalProcesses);
    }

    // Display the process queue**
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No remaining processes.");
            return;
        }

        System.out.println("Current Process Queue:");
        Process current = head;
        do {
            System.out.println("Process ID: " + current.processId + ", Remaining Time: " + current.remainingTime);
            current = current.next;
        } while (current != head);
    }

    // Count total processes**
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        Process current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
}
