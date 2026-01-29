package Stack_Queue_HashMap_HashingFunction;

class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0;
        int end = 0;
        int currentPetrol = 0;
        int count = 0;
        while (count < n && start < n) {
            currentPetrol += petrol[end] - distance[end];
            end = (end + 1) % n;
            count++;
            while (currentPetrol < 0 && count > 0) {
                int prevStart = start;
                currentPetrol -= (petrol[start] - distance[start]);
                start++;
                count--;
                if (start >= n)
                    return -1;
            }
        }
        return (currentPetrol >= 0 && count == n) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = { 4, 6, 7, 4 };
        int[] distance = { 6, 5, 3, 5 };
        System.out.println("Starting point: " + findStartingPoint(petrol, distance));
    }
}
