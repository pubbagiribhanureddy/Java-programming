public class gcd {
    // Recursive method to find GCD
    public static int gcd(int x, int y) {
        // Base case: if y is 0, gcd is x
        if (y == 0) {
            return x;
        }
        // Recursive case: gcd of y and remainder of x divided by y
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 60;
        System.out.println("G.C.D of " + num1 + " and " + num2 + " is " + gcd(num1, num2));
    }
}