package array;

import java.util.Scanner;

public class L16Array {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 0, 0 };

        // printArray(arr);

        // insertArr(arr, 2, 22);
        // printArray(arr);

        // deleteArr(arr, 2);
        // printArray(arr);
        Scanner sc = new Scanner(System.in);

        int my2dArray[][] = new int[3][2];

        for (int i = 0; i < my2dArray.length; i++) {
            for (int j = 0; j < my2dArray[i].length; j++) {

                System.out.println("Enter " + i + " " + j + " number");
                int element = sc.nextInt();
                my2dArray[i][j] = element;
            }
        }

        print2dArray(my2dArray);
        System.out.println();

        insert2dArray(my2dArray, 1, 1, 22);
        print2dArray(my2dArray);
        System.out.println();

        delete2dArray(my2dArray, 1, 1);
        print2dArray(my2dArray);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void insertArr(int arr[], int pos, int element) {
        int length = arr.length;

        if (pos < 0 || pos > length - 1) {
            System.out.println("Wrong Position");
            return;
        }

        for (int i = length - 2; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = element;
    }

    public static void deleteArr(int arr[], int pos) {
        for (int i = pos; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }

    public static void updateArr(int arr[], int pos, int element) {
        int length = arr.length;

        if (pos < 0 || pos > length - 1) {
            System.out.println("Wrong Position");
            return;
        }

        arr[pos] = element;
    }

    public static void print2dArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("For " + i + "th index");
            printArray(arr[i]);
        }
    }

    public static void insert2dArray(int arr[][], int i, int j, int element) {
        insertArr(arr[i], j, element);
    }

    public static void delete2dArray(int arr[][], int i, int j) {
        deleteArr(arr[i], j);
    }

    public static void update2dArray(int arr[][], int i, int j, int element) {
        updateArr(arr[i], j, element);
    }

}
