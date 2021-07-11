import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int cubicResult = 0;
        int numberOfRoots = 0;

        for (int x = 1; x <= 1000 && numberOfRoots < 3; x++) {
            cubicResult = a * x * x * x + b * x * x + c * x + d;
            if (cubicResult == 0) {
                System.out.println(x);
                numberOfRoots++;
            }
        }
    }
}