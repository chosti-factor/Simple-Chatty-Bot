import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanWords = new Scanner(System.in);

        String firstWord = scanWords.next();
        String secondWord = scanWords.next();
        String thirdWord = scanWords.next();
        String fourthWord = scanWords.next();
        String fifthWord = scanWords.next();

        System.out.println(firstWord + "\n" + secondWord + "\n" +
                thirdWord + "\n" + fourthWord + "\n" + fifthWord);
    }
}