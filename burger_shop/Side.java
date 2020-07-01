import java.util.HashMap;

public class Side {
    private String side;
    private double price;

    public Side(String side){
    this.side = side.toLowerCase();
    this.price = sides.get(side.toLowerCase());
    }

    private HashMap<String,Double> sides = new HashMap<String,Double>(){
        {
            put("fries",1.99);
            put("chips",1.49);
            put("apple pie",1.19);
            put("celery sticks",2.39);
            put("carrots",1.99);
            put("mixed fruit",1.59);
            put("ice cream",3.39);

        }
    };

    public Side getSide(){
        return this;
    }
    public String getName() {
        return side;
    }

    public double getPrice() {
        return price;
    }
}
