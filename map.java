import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class map {
    public static void main(String[] args){
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 25);
        students.put("Bob", 30);

        System.out.println(students.keySet());
        for(String key: students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }

        Map<String, Integer> students2 = new Hashtable<>();
        students2.put("Alice", 25);
        students2.put("Bob", 30);
        System.out.println(students2.keySet());
        for(String key: students2.keySet()){
            System.out.println(key + " : " + students2.get(key));
        }
        // HashMap allows null keys and values, while Hashtable does not
        // HashMap is not synchronized, while Hashtable is synchronized
        // HashMap is faster than Hashtable
    }
    
}
