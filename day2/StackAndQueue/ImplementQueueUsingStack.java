import java.util.Stack;

public class ImplementQueueUsingStack {
    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;

    public static void main(String[] args) {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

        addInQueue(4);
        addInQueue(2);
        addInQueue(3);
        addInQueue(5);
        addInQueue(6);

        dequeueFromQueue();
        dequeueFromQueue();
    }

    private static void dequeueFromQueue() {
        if(stack1.isEmpty()) {
            System.out.println("Queue is already empty...");
            return;
        }

        System.out.println(stack1.pop() + " is dequeued from the queue.");
    }

    private static void addInQueue(int num) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(num);

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        System.out.println(num + " enqueue to the queue.");
    }
}
