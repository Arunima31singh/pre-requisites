import java.util.Scanner;

public class sp_cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the cost price:");
        int cp = sc.nextInt();
        System.out.print("enter the selling price:");
        int sp = sc.nextInt();

        int profit = 0;
        int loss = 0;

        if(sp>cp){
            profit = sp-cp;
            System.out.println("the seller has gained some profit the gained profit is:" +profit);
            profit = (profit*100)/cp;

            System.err.println("when calculated in percentage its:"+ profit+ "%" );
        }
        else {
            loss = cp-sp;
            System.out.println("the seller has lost some money the lost amount is:" +loss);

            loss = (loss*100)/cp;
            System.out.println("the lost percentage is:" +loss+ "%" );
        }


    }
    
}
