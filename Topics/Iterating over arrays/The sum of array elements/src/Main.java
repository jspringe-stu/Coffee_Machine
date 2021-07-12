import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = scanner.nextInt();
        int adder = 0;
        for (int i = 0; i < lenght; i++) {
            adder += scanner.nextInt();
        }
        System.out.println(adder);


    }
}