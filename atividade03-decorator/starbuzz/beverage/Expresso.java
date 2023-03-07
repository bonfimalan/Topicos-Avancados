package starbuzz.beverage;

public class Expresso extends Beverage {
    public Expresso() {
        super.description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
