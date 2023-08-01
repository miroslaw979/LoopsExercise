import java.util.Scanner;

public class TrainTheTrainers04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount =Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double totalGrades = 0;
        int presentationCount = 0;
        while (!presentationName.equals("Finish")){

            double sumGrades = 0;
            for (int i = 1; i <= peopleCount ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }
            double avgGrade = sumGrades / peopleCount;
            totalGrades += avgGrade;
            presentationCount++;

            System.out.printf("%s - %.2f.%n", presentationName, avgGrade);

            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalGrades/presentationCount);
    }
}
