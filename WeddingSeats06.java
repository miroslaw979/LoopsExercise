import java.util.Scanner;

public class WeddingSeats06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int firstSector = Integer.parseInt(scanner.nextLine());
        int seatsCount = Integer.parseInt(scanner.nextLine());
        int seatsCountt= 0;

        for (char sector = 'A'; sector <=lastSector.charAt(0); sector++) {
            int seatsPerRow;
            for (int row = 1; row <=firstSector ; row++) {
                if (row % 2==0){
                    seatsPerRow = seatsCount +2;
                } else {
                    seatsPerRow = seatsCount;
                }
                for (char seat = 'a'; seatsPerRow > 0 ; seat++) {
                    System.out.printf("%s%d%s%n", sector,row,seat);
                    seatsCountt++;
                    seatsPerRow--;
                }
            }
            firstSector++;
        }
        System.out.println(seatsCountt);
    }
}
