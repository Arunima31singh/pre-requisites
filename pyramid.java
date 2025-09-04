import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner py = new Scanner(System.in);

        System.out.print("Enter the size of the pym:");
        int sz = py.nextInt();

        for(int i = 1 ; i <= sz ; i++){

            for(int j = 1 ; j<= (sz-i) ; j++){
                System.out.print(" ");
            }

            for( int j = 1 ; j <= (2*i-1) ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
