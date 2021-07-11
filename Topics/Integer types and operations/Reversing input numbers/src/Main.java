import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner numberInput = new Scanner(System.in);
        int firstNumber = numberInput.nextInt();
        int secondNumber = numberInput.nextInt();

        System.out.println(secondNumber + " " + firstNumber);
    }
}