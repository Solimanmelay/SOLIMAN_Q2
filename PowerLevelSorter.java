import java.util.Scanner;

public class PowerLevelSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] powerLevels = new int[10];

        // Input Power Levels
        System.out.println("Enter the power levels of 10 creatures:");
        for (int i = 0; i < 10; i++) {
            powerLevels[i] = scanner.nextInt();
        }

        // Bubble Sort (Ascending Order)
        bubbleSort(powerLevels);
        System.out.println("\nPower Levels (Bubble Sort - Ascending):");
        displayArray(powerLevels);

        // Selection Sort (Descending Order)
        selectionSort(powerLevels);
        System.out.println("\nPower Levels (Selection Sort - Descending):");
        displayArray(powerLevels);

        // Analysis
        int evenSum = 0;
        int oddSum = 0;
        int minPower = powerLevels[0];
        int maxPower = powerLevels[0];

        for (int powerLevel : powerLevels) {
            if (powerLevel % 2 == 0) {
                evenSum += powerLevel;
            } else {
                oddSum += powerLevel;
            }

            if (powerLevel < minPower) {
                minPower = powerLevel;
            }
            if (powerLevel > maxPower) {
                maxPower = powerLevel;
            }
        }

        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Power Levels: " + evenSum);
        System.out.println("Sum of Odd Power Levels: " + oddSum);
        System.out.println("Minimum Power Level: " + minPower);
        System.out.println("Maximum Power Level: " + maxPower);
    }

    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Implementation
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Helper function to display an array
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}