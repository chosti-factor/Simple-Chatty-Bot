import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialNumber = scanner.nextInt();
        int digitOnesPlace = initialNumber % ((initialNumber / 10) * 10);
        int digitTensPlace = (initialNumber - (initialNumber / 100) * 100) / 10;
        int digitHundredsPlace = initialNumber / 100;
        int finalNumber = digitOnesPlace * 100 + digitTensPlace * 10 + digitHundredsPlace * 1; // Reversing place value

        System.out.println(finalNumber);
    }
}