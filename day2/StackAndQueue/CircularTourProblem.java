public class CircularTourProblem {
    // A petrol pump has petrol and the distance to the next petrol pump
    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    // Function to find the starting petrol pump
    public static int findStartingPump(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0; // Starting petrol pump
        int end = 1;   // Next petrol pump
        int surplusPetrol = pumps[start].petrol - pumps[start].distance;

        // We loop until we complete the circular tour
        while (start != end || surplusPetrol < 0) {
            // If surplusPetrol is negative, move the start to the next pump
            while (surplusPetrol < 0 && start != end) {
                surplusPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % n;

                // If we have looped back to the starting point, no solution exists
                if (start == 0) {
                    return -1;
                }
            }

            // Add the next petrol pump to the current tour
            surplusPetrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % n;
        }

        // Return the starting petrol pump index
        return start;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = findStartingPump(pumps);
        if (start == -1) {
            System.out.println("No solution exists.");
        } else {
            System.out.println("Starting petrol pump index: " + start);
        }
    }
}