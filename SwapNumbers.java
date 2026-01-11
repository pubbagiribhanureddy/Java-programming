public class SwapNumbers {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before swapping: x = " + x + " y = " + y);

        x = x ^ y; // Step 1: XOR x and y
        y = x ^ y; // Step 2: XOR new x with y
        x = x ^ y; // Step 3: XOR new x with new y

        System.out.println("After swapping: x = " + x + " y = " + y);
    }
}