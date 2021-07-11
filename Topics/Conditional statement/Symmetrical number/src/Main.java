import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        char firstDigit = number.charAt(0);
        char secondDigit = number.charAt(1);
        char thirdDigit = number.charAt(2);
        char fourthDigit = number.charAt(3);
        boolean symmetric = firstDigit == fourthDigit && secondDigit == thirdDigit;

        if (symmetric) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}