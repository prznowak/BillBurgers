package BillBurgers;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe", 14.56, "White", "Sausage & Bacon" );
        super.addHamburgerAddition1("Chips",9.87);
        super.addHamburgerAddition2("Drink",1.98);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
