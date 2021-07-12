import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summeüberN = 0;
        //System.out.println("Wie lang is das Array: ");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            //System.out.println("Vorher: "+array[i]);
            array[i] = scanner.nextInt();
            //System.out.println("Nachher: "+array[i]);
        }

        //System.out.println("Zahlen ab welcher größe zählen: ");

        int limitZahl = scanner.nextInt();

        for (int zahl:array) {
            if (zahl > limitZahl) {
                summeüberN += zahl;
            }
        }
        System.out.println(summeüberN);
    }
}