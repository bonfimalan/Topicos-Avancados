package implementation;

import template.CaffeineBeverage;

public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea 🍵");
    }

    @Override
    public void addCodiments() {
        System.out.println("Adding Lemon 🍋");
    }
    
}
