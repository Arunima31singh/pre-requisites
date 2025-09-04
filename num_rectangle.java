import java.util.Scanner;

public class num_rectangle {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);

        System.out.print("enetr the side of the square:");
        int side = l.nextInt();

        for(int i = 1 ; i <= side ; i++){
            for(int j = i ; j<= side ; j++){
                System.out.print(j);

            }

            for(int j = 1 ; j<= (i-1) ; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
    


}
