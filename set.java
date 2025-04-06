import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class set {
    public static void main(String[] args){
        
        // we can also use Itertor or Collection instead of Set before the  generics as
        // Iterator<Integer> it = hashSet.iterator();
        // while(it.hasNext()){ -- instead of for loop
        // Collection<Integer> it = hashSet;
        // for(Iterator<Integer> it = hashSet.iterator(); it.hasNext();){
       
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(81);
        hashSet.add(22);
        hashSet.add(36);

        for (int num : hashSet) {
            System.out.println(num);
        }
        System.out.println("Set size: " + hashSet.size());
        System.out.println("Set contains 22: " + hashSet.contains(22));
        System.out.println("Set is empty: " + hashSet.isEmpty());
        hashSet.remove(22);
        System.out.println("Set after removing 22: " + hashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(81);
        treeSet.add(22);
        treeSet.add(36);
        for (int num : treeSet) {
            System.out.println(num);
        }
        System.out.println("Set size: " + treeSet.size());
        System.out.println("Set contains 22: " + treeSet.contains(22));
        System.out.println("Set is empty: " + treeSet.isEmpty());
        treeSet.remove(22);

    }
}
