import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner stringInput = new Scanner(System.in);
        String firstString = stringInput.nextLine();
        String secondString = stringInput.nextLine();
        String trimmedFirstString = firstString.replace(" ", "").replace("\t", "").
                replace("\n", "").replace("\r", "");
        String trimmedSecondString = secondString.replace(" ", "").replace("\t", "").
                replace("\n", "").replace("\r", "");
        boolean test = trimmedFirstString.equals(trimmedSecondString);

        System.out.println(test);
    }
}