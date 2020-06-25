

public class Burger {
    private String name;
    private String meat;
    private double price;
    private double originalPrice;
    private String breadRollType;

    private String toppingName1;
    private double toppingPrice1;

    private String toppingName2;
    private double toppingPrice2;

    private String toppingName3;
    private double toppingPrice3;

    private String toppingName4;
    private double toppingPrice4;


    public Burger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.originalPrice = price;
    }


    public void addTopping1(String name,double price){
        this.toppingName1 = name;
        this.toppingPrice1 = price;
    }
     public void addTopping2(String name,double price){
        this.toppingName2 = name;
        this.toppingPrice2 = price;
    }

    public void totalBurgerPrice(){
        System.out.println("Total price of this burger is "+this.price);
    }

    public void plainBurgerPrice(){
        System.out.println("Price of plain burger is "+this.originalPrice);
    }


    public double itemizeHamburger(){
        double burgerPrice =this.price;
        System.out.println(this.name + " burger on a "+this.breadRollType+ " roll with "+this.meat+".");
        System.out.println("The price is "+this.price);
        if(this.toppingName1 != null) {
            burgerPrice += this.toppingPrice1;
        System.out.println("Added "+this.toppingName1+" for an extra "+this.toppingPrice1);
        }
        if(this.toppingName2 != null) {
            burgerPrice += this.toppingPrice2;
        System.out.println("Added "+this.toppingName2+" for an extra "+this.toppingPrice2);
        }

        return burgerPrice;
    }
}
