import java.util.Scanner;
public class Demo017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print("Enter a two-digit number: "+number);
        int tens = number / 10;
        int ones = number % 10;
        int dog = tens + ones;
        System.out.println("The sum of the digits is: " + dog);
    }
}
