import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // n is chocolate's length in segments
        int m = scanner.nextInt(); // m is chocolate's width in segments
        int k = scanner.nextInt(); // k is number of segments to break off
        boolean smallerThanWhole = k < n * m; // Test to see if piece is smaller than whole chocolate
        boolean straightLineTest = k % n == 0 || k % m == 0; // Test to see if piece can be broken off in straight line

        if (straightLineTest && smallerThanWhole) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}