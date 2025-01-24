import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

class LinkedHashSetDemo {
    void linkedHashSetMethod() {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            lhs.add(scanner.nextInt());
        }

        System.out.println("LinkedHashSet: " + lhs);

        System.out.print("Enter an element to remove: ");
        int removeElement = scanner.nextInt();
        lhs.remove(removeElement);

        int sum = 0;
        for (Integer x : lhs) {
            sum += x;
        }

        System.out.println("The sum is: " + sum);

        Iterator<Integer> it = lhs.iterator();
        System.out.println("Elements in LinkedHashSet:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashSetMethod();
    }
}
