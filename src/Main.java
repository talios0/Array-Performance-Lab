import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> runners = new HashMap<String, Integer>() {
            {
                put("Elena", 341);
                put("Thomas", 273);
                put("Hamilton", 278);
                put("Suzie", 329);
                put("Phil", 445);
                put("Matt", 402);
                put("Alex", 388);
                put("Emma", 275);
                put("John", 243);
                put("James", 234);
                put("Jane", 412);
                put("Emily", 393);
                put("Daniel", 299);
                put("Neda", 343);
                put("Aaron", 317);
                put("Kate", 265);
            }};

        int leastIndex = ArrayFunctions.GetLeast(runners.values().toArray(new Integer[runners.size()]));
        int secondLeastIndex = ArrayFunctions.GetSecondLeast(runners.values().toArray(new Integer[runners.size()]));
        System.out.println("The runner with the fastest speed is " + runners.keySet().toArray(new String[runners.size()])[leastIndex] + " with a time of " + runners.values().toArray(new Integer[runners.size()])[leastIndex] + " minutes");
        System.out.println("The runner with the second fastest speed is " + runners.keySet().toArray(new String[runners.size()])[secondLeastIndex] + " with a time of " + runners.values().toArray(new Integer[runners.size()])[secondLeastIndex] + " minutes");
    }


}
