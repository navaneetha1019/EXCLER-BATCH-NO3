import java.util.Scanner;

public class PS002 {
    public static int nextMultipleOf100(int num) {
        return (num / 100 + 1) * 100;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = nextMultipleOf100(num);
        System.out.println("The next multiple of 100 is: " + result);
        scanner.close();
    }
}
