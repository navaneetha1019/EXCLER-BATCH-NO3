import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char ch = scanner.next().charAt(0);
        
        char upperChar = Character.toUpperCase(ch);
        System.out.println("Uppercase character: " + upperChar);
        
        scanner.close();
    }
}

