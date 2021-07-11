import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean withinIntervals = n > -15 && n <= 12 || n > 14 && n < 17 || n >= 19;

        if (withinIntervals) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}