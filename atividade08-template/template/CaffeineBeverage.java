package template;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCodiments();
    } 

    public abstract void brew();
    public abstract void addCodiments();

    public void boilWater() {
        System.out.println("Boiling water 🌊🔥");
    }

    public void pourInCup() {
        System.out.println("Pouring in cup 🥤");
    }
}
