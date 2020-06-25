

public class HealthBurger extends Burger {
    private String healthyExtraName1;
    private double healthyExtraPrice1;
    private String healthyExtraName2;
    private double healthyExtraPrice2;


    public HealthBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
  
    }

    public void addHealthyTopping1(String name, double price) {
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;

    }

    public void addHealthyTopping2(String name, double price) {
        this.healthyExtraName2 = name;
        this.healthyExtraPrice2 = price;

    }

    public double itemizeHamburger(){
        double burgerPrice =super.itemizeHamburger();
        if(this.healthyExtraName1 != null){
            burgerPrice += this.healthyExtraPrice1;
            System.out.println("Added "+this.healthyExtraName1+" for an extra "+this.healthyExtraPrice1);
        }
        if(this.healthyExtraName2 != null){
            burgerPrice += this.healthyExtraPrice2;
            System.out.println("Added "+this.healthyExtraName2+" for an extra "+this.healthyExtraPrice2);
        }
        return burgerPrice;
    }
}
