import implementation.Coffee;
import implementation.Tea;
import template.CaffeineBeverage;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        
        coffee.prepareRecipe();
        System.out.println("");
        tea.prepareRecipe();
    }
}