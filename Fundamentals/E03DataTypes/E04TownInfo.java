package E03DataTypes;

import java.util.Scanner;

public class E04TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String townName = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}
