import java.util.Scanner;


public class reading_string{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("ENTER VALID STRING:");
        String st = read.next();
        System.out.println("the read string is:" + st);
        String lt = read.nextLine();
        System.out.println("the whole string is:" + lt);



    }
}

