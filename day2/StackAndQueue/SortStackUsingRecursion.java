import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int temp = stack.pop();

            // Sort the remaining stack
            sortStack(stack);

            // Insert the popped element back in the correct position
            insertSorted(stack, temp);
        }
    }

    // Function to insert an element in the correct position in the sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            // If the stack is empty or the element is greater than the top element, push it
            stack.push(element);
        } else {
            // Pop the top element and recursively insert the element
            int temp = stack.pop();
            insertSorted(stack, element);

            // Push the popped element back
            stack.push(temp);
        }
    }
}