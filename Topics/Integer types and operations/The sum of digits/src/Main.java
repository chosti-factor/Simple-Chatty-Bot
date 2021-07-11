import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int onesDigit = number % 10;
        int tensDigit = (number % 100) / 10;
        int hundredsDigit = number / 100;
        int sumOfDigits = onesDigit + tensDigit + hundredsDigit;

        System.out.println(sumOfDigits);
    }
}