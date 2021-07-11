import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int twoDigitNumber = scanner.nextInt();
        int oneDigitNumber = twoDigitNumber / 10;
        System.out.println(oneDigitNumber);
    }
}