

public class DeluxeBurger extends Burger{
    public DeluxeBurger(String meat, String bread){
        super(meat,bread);
    }

    @Override
    public void addTopping(String name){
        if(selectedToppings.size()<6){
            this.selectedToppings.put(name.toLowerCase(),toppings.get(name));
        } else{
            throw new Error("Only six toppings are allowed on the deluxe burger!");
        }
    }


}
