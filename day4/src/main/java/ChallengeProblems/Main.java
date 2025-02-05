package ChallengeProblems;

public class Main {
    public static void main(String[] args) {
        // Array declaration
        int[] arr = {1, 4, 2, 56, 34};

        System.out.println("First missing positive element is: " + Challenges.firstMissingPositiveNumber(arr));

        int start = 0, end = arr.length - 1, target = 33;
        System.out.println("Result of searching for given target is: " + Challenges.binarySearch(arr, start, end, target));
    }
}
