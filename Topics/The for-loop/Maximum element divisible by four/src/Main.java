import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int element = 0;
        int maxElement = 0;

        for (int i = 0; i < n; i++) {
            element = scanner.nextInt();
            if (element % 4 == 0 && element > maxElement) {
                maxElement = element;
            }
        }

        System.out.println(maxElement);
    }
}