import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stock = {3, 5, 1, 10, 23, 4, 8, 5};

        Stack<Integer> stack = new Stack<>();
        int n = stock.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            // Maintain decreasing stack (pop while the current price is greater)
            while (!stack.isEmpty() && stock[stack.peek()] <= stock[i]) {
                stack.pop();
            }

            // Calculate span
            result[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index onto the stack
            stack.push(i);
        }

        // displaying the result
        for(int i : result) {
            System.out.println(i);
        }
    }
}
