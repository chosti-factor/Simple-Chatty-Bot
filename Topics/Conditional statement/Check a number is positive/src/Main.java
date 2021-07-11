import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); //Minimum hours of sleep

        if (number <= 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}