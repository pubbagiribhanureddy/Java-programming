public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of terms you want
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // update values
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
