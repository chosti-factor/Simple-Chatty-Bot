import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanWords = new Scanner(System.in);
        String[] word = new String[10];

        for (int wordCount = 1; wordCount <= 3; wordCount++) {
            word[wordCount] = scanWords.next();
        }

        for (int reverseCounter = 3; reverseCounter >= 1; reverseCounter--) {
            System.out.println(word[reverseCounter]);
        }
    }
}