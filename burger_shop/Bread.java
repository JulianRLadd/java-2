import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bread {
    String bread;
    List<String> breadTypes= new ArrayList<String>(Arrays.asList("rye","white","italian","wheat"));

    public Bread(String bread) {
        this.bread = bread;
        if (!breadTypes.contains(bread.toLowerCase())) {
            throw new Error("Not a valid bread type.");
        }
    }

    public String getBread(){
        return this.bread;
    }
}
