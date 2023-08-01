import java.util.Scanner;

public class SumPrimeNonPrime03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int sumPrime = 0;
        int sumNotPrime = 0;
        while (!command.equals("stop")){
            int number = Integer.parseInt(command);

            boolean isPrime = true;
            if (number<0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            for (int current = 2; current < number ; current++) {

                if (number % current == 0){
                    isPrime = false;
                    sumNotPrime += number;
                    break;
                }
            }
            if (isPrime){
                sumPrime+= number;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNotPrime);
    }
}
