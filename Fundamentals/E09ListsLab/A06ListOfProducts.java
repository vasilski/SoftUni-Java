package E09ListsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A06ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < count ; i++) {
            String product = scan.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 0; i <products.size() ; i++) {
            System.out.printf("%d.%s%n",i + 1, products.get(i));
        }
    }
}
