import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sq = new Scanner(System.in);
        System.out.print("enetr the number of the rows:");
        int nr = sq.nextInt();

        System.out.print("enter the number of column:");
        int nc = sq.nextInt();

        for(int i = 1 ; i <= nr ; i ++){
            for(int j = 1; j <=nc ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

