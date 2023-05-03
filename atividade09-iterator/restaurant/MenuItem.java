package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private boolean vegertarian;
    private double price;

    public MenuItem(String name, String description, boolean vegertarian, double price) {
        this.name = name;
        this.description = description;
        this.vegertarian = vegertarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegertarian() {
        return vegertarian;
    }

    public void setVegertarian(boolean vegertarian) {
        this.vegertarian = vegertarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name %s\nDescription %s\nVegetarian %s\nPrice %.2f 💵\n", 
                name, description, translateVegetarian(), price);
    }
    
    private String translateVegetarian() {
        return vegertarian ? "yes 🌿" : "no 🍖";
    }
}
