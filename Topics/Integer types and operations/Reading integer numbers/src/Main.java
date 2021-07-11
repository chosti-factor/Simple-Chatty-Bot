import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        int[] number = new int[100];
        int counter1 = 0;
        while (numberInput.hasNext()) {
            counter1++;
            number[counter1] = numberInput.nextInt();
        }
        for (int counter2 = 1; counter2 <= counter1; counter2++) {
            System.out.println(number[counter2]);
        }
    }
}
