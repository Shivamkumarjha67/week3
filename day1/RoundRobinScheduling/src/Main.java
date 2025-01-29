public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);  // Time Quantum = 4 units

        // Adding processes
        scheduler.addProcess(1, 8, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 12, 3);
        scheduler.addProcess(4, 6, 2);

        // Execute processes
        scheduler.executeProcesses();
    }
}