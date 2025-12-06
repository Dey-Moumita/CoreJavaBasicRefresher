package edu.logic.solutions;
import java.util.Scanner;
     public class DeleteElementInArrayByValue {

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

            // Step 3: Take the value to delete
            System.out.print("Enter the element you want to delete: ");
            int value = scanner.nextInt();

            // Step 4: Find the position (index) of that value
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (arr[i] == value) {
                    index = i;
                    break;
                }
            }

            // Step 5: Check if element was found
            if (index == -1) {
                System.out.println("Element not found in the array!");
                return;
            }

            // Step 6: Create new array of size - 1
            int[] newArr = new int[size - 1];

            // Step 7: Copy all except the found element
            for (int i = 0, j = 0; i < size; i++) {
                if (i == index) {
                    continue; // skip the element to delete
                }
                newArr[j] = arr[i];
                j++;
            }

            // Step 8: Print the new array
            System.out.println("Array after deleting " + value + ":");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }
    }
