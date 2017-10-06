package BillBurgers;

public class Hamburger {
    private String name;
    private double price;
    private String breadRollType;
    private String meatType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, double price, String breadRollType, String meatType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }


    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.breadRollType + " roll " +
                "with meat " + this.meatType + " price is " + this.price);

        if (addition1Name != null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + this.addition1Price);
        }
        if (addition2Name != null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + this.addition2Price);

        }
        if (addition3Name != null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + this.addition3Price);

        }
        if (addition4Name != null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + this.addition4Price);

        }
        if (addition1Name != null || addition2Name != null || addition3Name != null || addition4Name != null) {
            System.out.println("With additions the total price is " + hamburgerPrice);
        }
        return hamburgerPrice;
    }


}
