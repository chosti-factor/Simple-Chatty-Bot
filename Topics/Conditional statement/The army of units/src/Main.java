import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int armyUnits = scanner.nextInt();

        if (armyUnits < 1) {
            System.out.println("no army");
        } else if (armyUnits < 20) {
            System.out.println("pack");
        } else if (armyUnits < 250) {
            System.out.println("throng");
        } else if (armyUnits < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}