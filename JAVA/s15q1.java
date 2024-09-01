import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class s15q1 {
    public static void main(String[] args) {
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        // Reverse the linked list using Collections.reverse()
        Collections.reverse(fruitList);

        // Iterate over the list in reverse order using a ListIterator
        ListIterator<String> iterator = fruitList.listIterator(fruitList.size());
        while (iterator.hasPrevious()) {
            String fruit = iterator.previous();
            System.out.println(fruit);
        }
    }
}