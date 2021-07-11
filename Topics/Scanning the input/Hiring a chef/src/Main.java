//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanForm = new Scanner(System.in);

        String chefName = scanForm.nextLine();
        scanForm.nextLine();
        scanForm.nextLine();
        scanForm.nextLine();
        String chefCuisinePreference = scanForm.nextLine();

        System.out.println("The form for " + chefName + " is completed. We will contact you if we need a chef" +
                " that cooks " + chefCuisinePreference + " dishes.");
    }
}