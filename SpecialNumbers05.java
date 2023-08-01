import java.util.Scanner;

public class SpecialNumbers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <=9999 ; currentNum++) {

            int first = currentNum / 1000;
            int second = currentNum / 100 % 10;
            int third = currentNum / 10 % 10;
            int fourth = currentNum % 10;

            boolean firstDigit = number % first == 0;
            boolean secondDigit = second != 0 && number % second == 0;
            boolean thirdDigit = third !=0 && number % third == 0;
            boolean fourthDigit = fourth != 0 && number % fourth ==0;

            if (firstDigit && secondDigit && thirdDigit && fourthDigit){
                System.out.printf("%d ", currentNum);
            }

        }
    }
}
