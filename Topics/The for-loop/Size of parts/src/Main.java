import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfParts = scanner.nextInt();
        int detector = 0;
        int partsToShip = 0;
        int partsToFix = 0;
        int partsToReject = 0;

        for (int i = 0; i < numberOfParts; i++) {
            detector = scanner.nextInt();
            if (detector == -1) {
                partsToReject++;
            } else if (detector == 1) {
                partsToFix++;
            } else {
                partsToShip++;
            }
        }
        System.out.println(partsToShip + " " + partsToFix + " " + partsToReject);
    }
}