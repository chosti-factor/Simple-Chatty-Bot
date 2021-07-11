import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanWords = new Scanner(System.in);

        String firstWord = scanWords.next();
        String secondWord = scanWords.next();
        String thirdWord = scanWords.next();
        String fourthWord = scanWords.next();

        System.out.println(firstWord + "\n" + secondWord + "\n" + thirdWord + "\n" + fourthWord);
    }
}