import java.util.Scanner;

public class reverse_triangle {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("enetr the size of the triangle:");
        int size = sc.nextInt();

        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= (size+1-i) ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
