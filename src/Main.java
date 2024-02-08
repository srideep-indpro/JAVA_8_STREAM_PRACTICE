import java.util.Map;

public class Main {

    //Write a method to loop through a map and print out the keys and values
    public static void printMap(Map<String, String> map) {
        //Loop into the map and print key value pairs
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}