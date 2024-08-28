import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class s1q2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        // Display the contents using an Iterator
        System.out.println("Contents of the list using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the contents in reverse order using a ListIterator
        System.out.println("Contents of the list in reverse order using ListIterator:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Create another list and insert its elements between blue and yellow
        ArrayList<String> newColors = new ArrayList<>();
        newColors.add("pink");
        newColors.add("green");

        int index = colors.indexOf("blue") + 1;
        colors.addAll(index, newColors);

        System.out.println("Updated list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}