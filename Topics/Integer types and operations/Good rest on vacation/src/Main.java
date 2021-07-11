import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCostPerWay = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();
        int totalTripCost = flightCostPerWay * 2 + foodCostPerDay * days + hotelCostPerNight * (days - 1);

        System.out.println(totalTripCost);
    }
}