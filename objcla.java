import java.util.Scanner;

 class Animals{
    int num_legs = 4;
    String name;
    String color;
    String food;
    int weight;
    int height;

 }


public class objcla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENETR THE DETAILS OF YOUR ANIMAL");

        System.out.print("Enter the number of legs:");
        int n = sc.nextInt();
        System.out.print("Enetr the name of your animal:");
        String na = sc.next();
        System.out.print("enter color of the animal:");
        String c = sc.next();
        System.out.print("Enter what kind of diet he follow: ");
        String f = sc.next();
        System.out.print("enter the weight of the animal:");
        int wt = sc.nextInt();
        System.out.print("enter the height of the animaal:");
        int h = sc.nextInt();

        Animals an1 = new Animals();
        an1.num_legs = n;
        an1.name = na;
        an1.color = c;
        an1.food = f;
        an1.weight = wt;
        an1.height = h;

        System.out.println("DETAILS OF YOUR CONSTRUCTED ANIMAL IS AS FOLLOWS");
        System.err.println(an1.num_legs);
        System.err.println(an1.name);
        System.err.println(an1.color);
        System.err.println(an1.food);
        System.err.println(an1.weight);
        System.err.println(an1.height);




        


      




    }

    
}
