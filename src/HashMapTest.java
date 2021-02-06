import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<String,Integer> items = new HashMap<>();

        items.put(null,3);
        items.put(null,4);

        System.out.println(items);

        items.put("apple", 5);
        items.put("banana", 3);
        items.put("lemon", 7);
        items.put("strawberry", 2);

        System.out.println(items);

        items.put("бананы",8);
        System.out.println(items.get("бананы"));

        if(items.containsKey("lemon")){
            System.out.println("available");
        }
    }

}
