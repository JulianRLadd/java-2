import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink {
    private String drink;
    private double price;
    List<String> drinkTypes= new ArrayList<String>(Arrays.asList("coke","sprite","lemonade","powerade","diet coke"));

    public Drink(String drink){
        this.drink = drink;
        this.price = 2.79;
        if (!drinkTypes.contains(drink.toLowerCase())) {
            throw new Error("Not a valid drink.");
        }
    }

    public Drink getDrink(){
        return this;
    }

    public String getName(){
        return this.drink;
    }
    public double getPrice(){
        return this.price;
    }

}
