import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        int n = numberInput.nextInt();
        int k = numberInput.nextInt();
        int nutsPerSquirrel = k / n;

        System.out.println(nutsPerSquirrel);
    }
}