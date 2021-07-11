import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        int integerInput1 = scanner.nextInt();
        int integerInput2 = scanner.nextInt();

        String outputText = textInput.substring(integerInput1, integerInput2 + 1);
        System.out.println(outputText);
    }
}