import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] someArray = new int[scanner.nextInt()];

        for (int i = 1; i < someArray.length; i++) {
            someArray[i] = scanner.nextInt();
        }

        someArray[0]= scanner.nextInt();

        for (int num : someArray) {
            System.out.print(num + " ");
        }

/*        String formattedString = Arrays.toString(someArray)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();

        System.out.println(formattedString);*/

    }
}