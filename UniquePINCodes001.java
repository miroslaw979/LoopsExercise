import java.util.Scanner;

public class UniquePINCodes001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int three = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=first ; i++) {
            if (i % 2 ==0){
                for (int j = 1; j <= second ; j++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7){
                        for (int k = 1; k <= three ; k++) {
                            if (k % 2 == 0){
                                System.out.printf("%d %d %d%n", i, j ,k);
                            }
                        }
                    }
                }
            }
        }
    }
}
