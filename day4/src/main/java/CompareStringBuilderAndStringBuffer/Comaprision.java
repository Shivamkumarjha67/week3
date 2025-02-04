package CompareStringBuilderAndStringBuffer;

// Comparision class for comparing the stringbuilder
public class Comaprision {
    // Method declaration for comparing the execution
    public static void compareExecutiontime(int times) {
        // String object for manupulating
        String str = "hello";
        // String builder object
        StringBuilder resultByStringBuilder = new StringBuilder();
        // String buffer object
        StringBuffer resultByStringBuffer = new StringBuffer();

        // time duration storing variable declaration
        long startTime, endtime;
        // Storing the starting time
        startTime = System.nanoTime();

        // Adding the string to the string builder variable for given number of times
        for(int i=0; i<times; i++) {
            resultByStringBuilder.append(str);
        }

        // Storing the end time
        endtime = System.nanoTime();
        // Printing the time taken by string builder operations
        System.out.println("Time taken for operating on the stringbuilder is: " + (endtime - startTime));

        // Storing the starting time
        startTime = System.nanoTime();

        // Adding the string to the string buffer variable for given number of times
        for(int i=0; i<times; i++) {
            resultByStringBuffer.append(str);
        }

        // Storing the end time
        endtime = System.nanoTime();
        // Printing the time taken by string buffer operations
        System.out.println("Time taken for operating on the stringbuffer is: " + (endtime - startTime));
    }
}
