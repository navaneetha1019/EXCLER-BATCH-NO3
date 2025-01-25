import java.util.Scanner;

public class Demo020 {
    public static void main(String[] args) {
        Demo020 demo = new Demo020();
        demo.fizbuz();
    }

    public void fizbuz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("fizbuz");
        } else if (num % 3 == 0) {
            System.out.println("fiz");
        } else if (num % 5 == 0) {
            System.out.println("buz");
        } else {
            System.out.println("error");
        }
        sc.close();
    }
}
