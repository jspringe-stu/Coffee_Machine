package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // one, two, three, testing, testing
        Scanner scanner = new Scanner(System.in);

        int howManyCoffeeYouWant = 0;
        String whatCoffee;
        boolean onOff = true;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int disposableCups = 9;
        int money = 550;
/*
        System.out.print("The coffee machine has:\n" + water + " of water\n"+milk+" of milk\n"+beans+ " of beans\n"
                +disposableCups+" of disposable cups\n"+money + " of money\n\n");
*/

        int oneEspressoNeedsThisAmountOfWater = 250;
        int oneEspressoNeedsThisAmountOfBeans = 16;
        int oneEspressoPrice = 4;

        int oneLatteNeedsThisAmountOfWater = 350;
        int oneLatteNeedsThisAmountOfBeans = 20;
        int oneLatteNeedsThisAmountOfMilk = 75;
        int oneLattePrice = 7;

        int oneCappucinoNeedsThisAmountOfWater = 200;
        int oneCappuccinoNeedsThisAmountOfBeans = 12;
        int oneCappuccinoNeedsThisAmountOfMilk = 100;
        int oneCappuccinoPrice = 6;

        while (onOff) {

            System.out.print("Write action (buy, fill, take, remaining, exit):\n");
            String buyFillTake = scanner.next();
            switch (buyFillTake) {

                case "buy":
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu: \n");
                    switch (whatCoffee = scanner.next()) {
                        case "1":
                            // Espresso

                            if(water >= oneEspressoNeedsThisAmountOfWater &&
                                    beans >= oneEspressoNeedsThisAmountOfBeans &&
                                    disposableCups >= 1) {

                                System.out.println("I have enough resources, making you a coffee!\n");

                                water -= oneEspressoNeedsThisAmountOfWater;
                                beans -= oneEspressoNeedsThisAmountOfBeans;
                                money += oneEspressoPrice;
                                disposableCups -= 1;

                            } else {

                                if(water < oneEspressoNeedsThisAmountOfWater) {
                                    System.out.println("Sorry not enough water\n");
                                } else if (beans < oneEspressoNeedsThisAmountOfBeans) {
                                    System.out.println("Sorry not enough coffee beans\n");
                                } else {
                                    System.out.println("Sorry not enough disposable cups\n");
                                }
                            }

                            break;

                        case "2":
                            // Latte

                            if(water >= oneLatteNeedsThisAmountOfWater &&
                                    beans >= oneLatteNeedsThisAmountOfBeans &&
                                    milk >= oneLatteNeedsThisAmountOfMilk &&
                                    disposableCups >= 1) {

                                System.out.println("I have enough resources, making you a coffee!\n");

                                water -= oneLatteNeedsThisAmountOfWater;
                                milk -= oneLatteNeedsThisAmountOfMilk;
                                beans -= oneLatteNeedsThisAmountOfBeans;
                                money += oneLattePrice;
                                disposableCups -= 1;

                            } else {

                                    if(water < oneLatteNeedsThisAmountOfWater) {
                                        System.out.println("Sorry not enough water\n");
                                    } else if (beans < oneLatteNeedsThisAmountOfBeans) {
                                        System.out.println("Sorry not enough coffee beans\n");
                                    } else if (milk < oneLatteNeedsThisAmountOfMilk) {
                                        System.out.println("Sorry not enough milk\n");
                                    } else {System.out.println("Sorry not enough disposable cups\n");}
                                }

                            break;

                        case "3":
                            //Cappuccino

                            if(water >= oneEspressoNeedsThisAmountOfWater &&
                                    beans >= oneEspressoNeedsThisAmountOfBeans &&
                                    disposableCups >= 1) {

                                System.out.println("I have enough resources, making you a coffee!\n");

                            water -= oneCappucinoNeedsThisAmountOfWater;
                            milk -= oneCappuccinoNeedsThisAmountOfMilk;
                            beans -= oneCappuccinoNeedsThisAmountOfBeans;
                            money += oneCappuccinoPrice;
                            disposableCups -= 1;

                            } else {

                                if(water < oneCappucinoNeedsThisAmountOfWater) {
                                    System.out.println("Sorry not enough water\n");
                                } else if (beans < oneCappuccinoNeedsThisAmountOfBeans) {
                                    System.out.println("Sorry not enough coffee beans\n");
                                } else if (milk < oneCappuccinoNeedsThisAmountOfMilk) {
                                    System.out.println("Sorry not enough milk\n");
                                } else {System.out.println("Sorry not enough disposable cups\n");}
                            }

                            break;

                        case "back":
                            continue;


                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    disposableCups += scanner.nextInt();

                    break;

                case "take":
                    System.out.println("I gave you $" + money + "\n");
                    money -= money;

                    break;

                case "remaining":
                    System.out.print("The coffee machine has:\n" + water + " of water\n" + milk + " of milk\n" + beans + " of beans\n"
                            + disposableCups + " of disposable cups\n" + money + " of money\n\n");
                    break;
                case "exit":
                    onOff = false;
            }

        }


/*      System.out.println("Write how many ml of water the coffee machine has: ");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        howManyCoffeeYouWant = scanner.nextInt();
*/

/*
        int counter =0;

        if ( howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfWater <= water &&
                howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfMilk <= milk &&
                howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfBeans <= beans ) {

            water = water - howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfWater;
            milk = milk - howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfMilk;
            beans = beans - howManyCoffeeYouWant * oneCoffeeNeedsThisAmountOfBeans;

            System.out.print("Yes, I can make that amount of coffee");

            while ( water >= oneCoffeeNeedsThisAmountOfWater &&
                    milk >= oneCoffeeNeedsThisAmountOfMilk &&
                    beans >= oneCoffeeNeedsThisAmountOfBeans ) {


                water = water - oneCoffeeNeedsThisAmountOfWater;
                milk = milk - oneCoffeeNeedsThisAmountOfMilk;
                beans = beans - oneCoffeeNeedsThisAmountOfBeans;

                ++counter;

                //System.out.println("\n\n\nDer Zähler steht bei: " + counter);


            }

            if(counter > 0) {
                System.out.print(" (and even "+ counter +" more than that)");
            }


        } else if(  water > oneCoffeeNeedsThisAmountOfWater &&
                milk > oneCoffeeNeedsThisAmountOfMilk &&
                beans > oneCoffeeNeedsThisAmountOfBeans ) {

            while (water >= oneCoffeeNeedsThisAmountOfWater &&
                    milk >= oneCoffeeNeedsThisAmountOfMilk &&
                    beans >= oneCoffeeNeedsThisAmountOfBeans) {


                water = water - oneCoffeeNeedsThisAmountOfWater;
                milk = milk - oneCoffeeNeedsThisAmountOfMilk;
                beans = beans - oneCoffeeNeedsThisAmountOfBeans;

                ++counter;


            }
            System.out.println("No, I can make only " +counter+ " cup(s) of coffee");
        }

*/

    }
}
