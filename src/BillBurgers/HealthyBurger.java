package BillBurgers;

public class HealthyBurger extends Hamburger {


    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( double price,  String meatType) {
        super("Healthy", price,"Brown rye", meatType);
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }


    @Override
    public double itemizeHamburger() {
        double healthyHamburgerPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added from healthy" +  this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            healthyHamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added from healthy " +  this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        if ( this.healthyExtra1Name != null ||  this.healthyExtra2Name != null) {
            System.out.println("With extra 2 additions the total price for healthy Hamburger is " + healthyHamburgerPrice);
        }

        return healthyHamburgerPrice;
    }
}
