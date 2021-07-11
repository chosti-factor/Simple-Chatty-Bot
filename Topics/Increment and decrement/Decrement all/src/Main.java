import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[4];

        for (int i = 0; i <= 3; i++) {
            number[i] = scanner.nextInt();
            --number[i];
            System.out.print(number[i]);
            System.out.print(" ");
        }
    }
}