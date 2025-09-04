import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int num = sc.nextInt();

        if(num>=0){
            System.err.println("the absolute value is:" +num);
        }
        else{
            num = num*-1;
            System.out.println("the absolute value is:" +num);
        }

    }
    
}
