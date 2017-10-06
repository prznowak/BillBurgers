package BillBurgers;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("PrzemekHAM", 22.00, "white", "beef");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("lettuce", 11.00);
        hamburger.addHamburgerAddition2("tomato", 9.00);

        hamburger.itemizeHamburger();

        System.out.println("----------------------------------");
        System.out.println("Total Burger price is " +hamburger.itemizeHamburger());
        System.out.println("----------------------------------");
        HealthyBurger healthyBurger = new HealthyBurger(13.00, "Bacon");
        //healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 23.00);
        healthyBurger.addHealthAddition2("cucumber",19.00);

        healthyBurger.itemizeHamburger();

        System.out.println("------------------------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger();

        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("egg",23.00);
    }
}
