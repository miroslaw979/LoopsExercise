import java.util.Scanner;

public class ChallengetheWedding005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int woman = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        int counts = 0;

        for (int i = 1; i <=men ; i++) {
            for (int j = 1; j <=woman ; j++) {
                counts++;
                System.out.printf("(%d <-> %d) ", i,j);
                if (counts==maxTables){
                    break;
                }
            }
            if (counts == maxTables){
                break;
            }
        }
    }
}
