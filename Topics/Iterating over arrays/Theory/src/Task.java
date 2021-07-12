// You can experiment here, it won’t be checked

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean contains = false;

        int[] array = new int[scanner.nextInt()];


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int searchForInt = scanner.nextInt();

        for (int a : array) {
            if (a == searchForInt) {
                contains = true;
            }
        }

        System.out.println(contains);


    }
}
