import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meat {
    String meat;
    List<String> meatTypes= new ArrayList<String>(Arrays.asList("beef","chicken","steak","sausage","bacon"));

    public Meat(String meat) {
        this.meat = meat;
        if (!meatTypes.contains(meat.toLowerCase())) {
            throw new Error("Not a valid meat type.");
        }
    }

    public String getMeat(){
        return this.meat;
    }
}
