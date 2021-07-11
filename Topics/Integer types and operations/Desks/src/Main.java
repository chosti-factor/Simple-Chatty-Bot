import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();

        int desksGroupA = (groupA + (2 - 1)) / 2;
        int desksGroupB = (groupB + (2 - 1)) / 2;
        int desksGroupC = (groupC + (2 - 1)) / 2;
        int totalDesks = desksGroupA + desksGroupB + desksGroupC;

        System.out.println(totalDesks);
    }
}
