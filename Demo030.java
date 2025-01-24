import java.util.ArrayList;
import java.util.Iterator;

public class Demo030 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();

        friends.add("navi");
        friends.add("smrithi");
        friends.add("honey");
        friends.add("abhii");
        friends.add("girls");

        Iterator<String> iterator = friends.iterator();

        System.out.println("List of Friends:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
