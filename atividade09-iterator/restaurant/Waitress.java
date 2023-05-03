package restaurant;

import iterator.Iterator;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    
    public void printMenu() {
        System.out.println("MENU\n-----\nBREAKFAST");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("LUNCH");
        printMenu(dinerMenu.createIterator());
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }    
}
