import java.util.Scanner;

public class Demo018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        System.out.print("Enter minutes: "+minutes);
        sc.close();
        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int days = remainingMinutes / 1440;
        remainingMinutes = remainingMinutes % 1440;
        int hours = remainingMinutes / 60;
        remainingMinutes = remainingMinutes % 60;
        System.out.println(minutes + " minutes is equal to:");
        System.out.println(years + " years");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(remainingMinutes + " minutes");
    }
}