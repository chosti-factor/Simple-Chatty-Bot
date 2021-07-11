import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); //Minimum hours of sleep
        int b = scanner.nextInt(); //Maximum hours of sleep
        int h = scanner.nextInt(); //Actual sleep hours

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}