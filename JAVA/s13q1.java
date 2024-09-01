import java.util.Iterator;
import java.util.LinkedList;

public class s13q1 {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}