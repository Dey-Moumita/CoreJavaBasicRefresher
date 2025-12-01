package edu.logic.solutions;
import java.util.Scanner;
public class DeletingAnElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Step 2: Take array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Step 3: Take position of element to delete
        System.out.print("Enter the position to delete (1 to " + size + "): ");
        int position = scanner.nextInt();

        // Step 4: Create new array (size - 1)
        int[] newArr = new int[size - 1];

        // Step 5: Copy all except the deleted element
        for (int i = 0, j = 0; i < size; i++) {
            if (i == position - 1) {
                continue; // skip the element to delete
            }
            newArr[j] = arr[i];
            j++;
        }

        // Step 6: Print new array
        System.out.println("Array after deletion:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
