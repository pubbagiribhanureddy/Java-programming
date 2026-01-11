import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        // Index of the last unique element
        int j = 0;
        // Traverse the array from the second element
        for (int i = 1; i < arr.length; i++) {
            // If current element is different from last unique element,
            // increment j and update arr[j]
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;  // Number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        int length = removeDuplicates(arr);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
