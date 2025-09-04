import java.util.Scanner;
public class input {
    public static void main(String[] args) {
       Scanner V = new Scanner(System.in);
       System.out.print("enter any integer data type:");
       int dt = V.nextInt();
       System.out.println("your inputed data is:" + dt);
       System.out.print("enter a boolean data type:");
       Boolean tf = V.nextBoolean();
       System.out.println("the inputed boolean value is:" + tf);
       
}
    
}

