package starbuzz;

import starbuzz.beverage.Beverage;
import starbuzz.beverage.Expresso;
import starbuzz.beverage.HouseBlend;
import starbuzz.decorator.Mocha;
import starbuzz.decorator.Soy;
import starbuzz.decorator.Whip;

public class Main {
    public static void main(String... args) {
        System.out.println("Creating Expresso with soy and mocha:");   
        Beverage beverage1 = new Expresso();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        printBeverage(beverage1);

        System.out.println("Creating House Blend with whip, mocha and soy:");   
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        printBeverage(beverage2);

        System.out.println("Creating House Blend with whip, mocha and double soy:");   
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Whip(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Soy(beverage3);
        printBeverage(beverage3);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.printf(
            "======================================================\n" +
            "Description: %s \n" +
            "Cost: %.2f \n" +
            "======================================================\n\n",
            beverage.getDescription(),
            beverage.cost()
        );
    }
}
