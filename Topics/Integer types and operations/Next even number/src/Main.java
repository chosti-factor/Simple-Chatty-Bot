import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        int anyNumber = numberInput.nextInt();
        int evenNumber = (anyNumber / 2) * 2 + 2;

        System.out.println(evenNumber);
    }
}