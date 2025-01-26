

import java.util.*;

public class Demo006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter username: ");
            String id = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if(id.equals("Navi") && pass.equals("navi_123")) {
                System.out.println("Hello Navi, You are welcome ");
                break;
            } else {
                System.out.println("Credentials do not match. Please try again.");
            }
        }
        sc.close();
    }
}
