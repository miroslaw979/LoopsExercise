import java.util.Scanner;

public class LettersCombinations002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        int count =0;

        for (int i = a; i <=b ; i++) {
            for (int j = a; j <= b ; j++) {
                for (int k = a; k <= b; k++) {
                    if (c != i && c != j && c != k){
                        count++;
                        System.out.printf("%c%c%c ",i,j,k,count);
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}
