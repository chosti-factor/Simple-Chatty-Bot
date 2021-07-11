import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanGuests = new Scanner(System.in);
        String[] guestNames = new String[10]; // Array of guest names is arbitrarily set to 10.
        int guestCount = 0;

        while (scanGuests.hasNext()) {
            guestCount++;
            guestNames[guestCount] = scanGuests.next();
        }

        for (int reverseCounter = guestCount; reverseCounter >= 1; reverseCounter--) {
            System.out.println(guestNames[reverseCounter]);
        }
    }
}