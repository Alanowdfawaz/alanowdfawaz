import jdk.nashorn.internal.parser.Scanner;

/**
 * Created by xenon on 2/10/2021.
 */
class REVER {
    // Function to print the array
    static void printArray(int arr[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args)
    {
        int original_arr[] = {1, 2, 3, 4, 5};
        int len = original_arr.length;
        int copied_arr[] = new int[len], i, j;

        // Copy the elements of the array
        // in the copied_arr in Reverse Order
        for (i = 0; i < len; i++)
        {
            copied_arr[i] = original_arr[len - i - 1];
        }
        System.out.printf("\nOriginal array: ");
        printArray(original_arr, len);
        System.out.printf("\nResultant array: ");
        printArray(copied_arr, len);
    }
}
