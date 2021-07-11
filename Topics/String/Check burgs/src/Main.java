import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cityName = scan.nextLine();
        boolean cityEndsWithBurg = cityName.endsWith("burg");
        System.out.println(cityEndsWithBurg);
    }
}