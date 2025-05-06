package array;

public class LinearSearch {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 2, 3, 4, 5, 5, 6, 2, 3, 1, 4, 5, 2, 3 };
        // linearSearchMultiple(arr, 2);
        // findMax(arr);
        // findMin(arr);

        int arr2d[][] = {
                { 1, 2, 3, 2, 4 },
                { 2, 4, 5, 3, 1 },
                { 3, 4, 1, 4, 3 }, // 15
                { 4, 2, 1, 2, 3 }
        };

        // linearSearch2dArray(arr2d, 4);
        // linearSearch2dArrayMultiple(arr2d, 4);
        maxSumSubarray2d(arr2d);

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void print2dArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + "th index");
            printArray(arr[i]);
        }
    }

    public static void linearSearchMultiple(int arr[], int target) {
        int ans[] = new int[arr.length];
        int indexOfTarget = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[indexOfTarget] = i;
                indexOfTarget++;
            }
        }

        printArray(ans);
    }

    public static void findMax(int arr[]) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The max value in the array is: " + max);
    }

    public static void findMin(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The min value in the array is: " + min);
    }

    public static void linearSearch2dArray(int arr[][], int target) {
        int outerIndex = 0;
        int innerIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isFound = false;
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    outerIndex = i;
                    innerIndex = j;
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        System.out.println("The target element is fount at " + innerIndex + " of " + outerIndex);

    }

    public static void linearSearch2dArrayMultiple(int arr[][], int target) {
        int length = 0;
        int indexOfTarget = 0;

        for (int i = 0; i < arr.length; i++) {
            length = length + arr[i].length;
        }

        int ans[][] = new int[length][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    ans[indexOfTarget][0] = i;
                    ans[indexOfTarget][1] = j;
                    indexOfTarget++;
                }
            }
        }

        for (int i = 0; i < indexOfTarget; i++) {
            System.out.println("Element found at position: " + ans[i][0] + "," + ans[i][1]);
        }

    }

    public static void maxSumSubarray2d(int arr[][]) {
        int ans = 0;
        int maxSumSubarray = 0;

        for (int j = 0; j < arr[0].length; j++) {
            maxSumSubarray += arr[0][j];
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
                System.out.println("Sum of the index " + i + " is " + sum);
            }
            if (sum > maxSumSubarray) {
                maxSumSubarray = sum;
                ans = i;
            }
        }

        System.out.println("Index of maximum sum subarray: " + ans + " with the sum: " + maxSumSubarray);

    }
}
