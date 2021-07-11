import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        String originalString = scan.nextLine();
        String newString = originalString.replaceAll("a", "b");
        System.out.println(newString);
    }
}