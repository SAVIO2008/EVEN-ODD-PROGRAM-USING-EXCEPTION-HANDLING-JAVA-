import java.util.*;


class Ex extends Exception {
    public Ex(String message) {
        super(message); 
    }
}

public class Excep {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
        try {
            int num;
               System.out.println("Enter no.");
               num= sc.nextInt();
            if (num % 2 != 0) {
                     System.out.println("Odd");
       } else {
                throw new Ex("Even Exception");
            }
        } catch (Ex e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}
