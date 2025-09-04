import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr any number:");
        int n = sc.nextInt();
     //JUST AN EXAMPLE OF LOOPS   
        if(n>0){
            System.out.println("the number entered is positive");
        }
        else{
            System.out.println("the number u have entered is odd");
        }
        //EVEN ODD WITH LOOPS
        if(n%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    
    //LOOPS IN LOOPS

    if(n>0){
        System.out.println("the entered number is positive and we will check is ist even or odd");
        if(n%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println(" the number is odd");
        }
    }
    else{
        System.out.println("the number is less than zero we will check even odd only for positive values!!!");
    }

}

    
}
