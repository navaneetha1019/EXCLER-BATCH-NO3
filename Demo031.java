import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Demo031 {

    private HashSet<Object> hSet = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Demo031 demo = new Demo031();
        demo.collectData();
        demo.displayData();
    
    }

    private void collectData() {
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        hSet.add(name);

        System.out.print("Enter an age: ");
        int age = scanner.nextInt();
        hSet.add(age);
    }

    private void displayData() {
        Iterator<Object> iterator = hSet.iterator();
        
        System.out.println("List of data:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("final HashSet: " +hSet);
    }
}
