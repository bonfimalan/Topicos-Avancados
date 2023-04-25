package implementation;

import template.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffe through filter ☕");
    }

    @Override
    public void addCodiments() {
        System.out.println("Adding Sugar and Milk 🍬🥛");;
    }
    
}
