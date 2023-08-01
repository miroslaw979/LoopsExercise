import java.util.Scanner;

public class EqualSumsEvenOddPosition02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        for (int i = firstNum; i <=secondNum ; i++) {


            int firstNumb = i / 100000;
            int secondNumb = i / 10000 %10;
            int third = i / 1000 %10;
            int four = i / 100 % 10;
            int five = i / 10 % 10;
            int six = i % 10;


            int evenSum = secondNumb + four + six;
            int oddSum = firstNumb + third + five;

                if (evenSum == oddSum){
                    System.out.printf("%d%n",i);
                }
        }
    }
}
