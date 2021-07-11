import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int daysToClimb = (h - a) / (a - b) + 1;
        int remainder = (h - a) % (a - b);
        if (remainder > 0) {
            daysToClimb++;
        }
        System.out.println(daysToClimb);
    }
}