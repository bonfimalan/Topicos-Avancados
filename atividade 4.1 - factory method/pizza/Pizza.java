package pizza;

public abstract class Pizza {
    protected String pizzaName;

    public void prepare() {
        System.out.println("Preparing a " + pizzaName);
    }

    public void bake() {
        System.out.println("Baking 🍕");
    } 
    
    public void cut() {
        System.out.println("Cutting 🔪");
    } 
    
    public void box() {
        System.out.println("Put in the box 📦");
    }
}
