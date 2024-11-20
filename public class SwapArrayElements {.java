public class SwapArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Before swap:");
        printArray(array);

        // Swapping the first and last elements
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        array[0] = lastElement;
        array[array.length - 1] = firstElement;

        System.out.println("After swap:");
        printArray(array);
    }

    // Helper method to print array elements
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
