import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean successParty = (numberOfCups >= 10 && numberOfCups <= 20) && !isWeekend || 
            (numberOfCups >= 15 && numberOfCups <= 25) && isWeekend;

        System.out.println(successParty);
    }
}
