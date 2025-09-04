import java.util.Scanner;

public class validitycheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the data type u want to check:");
        Boolean yup = sc.hasNextInt();
        System.out.println("the data you enterd is :" + yup);

    }
    
}
