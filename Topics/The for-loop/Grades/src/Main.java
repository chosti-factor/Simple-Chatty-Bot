import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfGrades = scanner.nextInt();
        int grade = 0;
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            grade = scanner.nextInt();
            if (grade == 5) {
                gradeA++;
            } else if (grade == 4) {
                gradeB++;
            } else if (grade == 3) {
                gradeC++;
            } else {
                gradeD++;
            }
        }

        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}