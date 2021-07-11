import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        String yearType = "";

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    yearType = "Leap";
                } else {
                    yearType = "Regular";
                }
            } else {
                yearType = "Leap";
            }
        } else {
            yearType = "Regular";
        }
        System.out.println(yearType);
    }
}