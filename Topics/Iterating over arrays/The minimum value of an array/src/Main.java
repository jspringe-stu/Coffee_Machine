import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallestNumber = 0;
        int array[] = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > smallestNumber) {
                smallestNumber = i;
            }
        }
        System.out.println(smallestNumber);
    }
}