package E15AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Arrays.stream(input).filter(word -> word.length() % 2 == 0).forEach(word -> System.out.println(word));
    }
}
