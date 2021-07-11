import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int timeHours1 = scanner.nextInt();
        int timeMinutes1 = scanner.nextInt();
        int timeSeconds1 = scanner.nextInt();
        int timeHours2 = scanner.nextInt();
        int timeMinutes2 = scanner.nextInt();
        int timeSeconds2 = scanner.nextInt();

        int totalSeconds = (timeHours2 - timeHours1) * 3600 + (timeMinutes2 - timeMinutes1) * 60 +
                (timeSeconds2 - timeSeconds1);
        System.out.println(totalSeconds);
    }
}