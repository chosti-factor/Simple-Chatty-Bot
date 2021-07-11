import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String textInput = scan.nextLine();
        String firstCharacter = textInput.substring(0, 1);
        boolean test = "J".equalsIgnoreCase(firstCharacter);
        System.out.println(test);
    }
}