package compsci20_assignment2;



import java.util.Scanner;

class Main 
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Input details for the third kart");
        System.out.println("Kart Name: ");
        String name = scan.nextLine();
        System.out.println("kart distance: ");
        Double distance = scan.nextDouble();
        System.out.println("Kart direction: ");
        Integer direction = scan.nextInt();
        System.out.println(" ");

        String newname = name.toUpperCase();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart("Luigi", 15, 110 );
        Kart kart3 = new Kart(newname, distance, direction);

        System.out.println("Initial Postions: ");
        System.out.println(kart1);
        System.out.println(kart2);
        System.out.println(kart3);

        System.out.println(" ");
        System.out.println("Initial Distances");
        System.out.println("The distance between Kart 1 and Kart 2  is: " + (kart1.distTo(kart2)) + " Meters.");
        System.out.println("The distance between Kart 1 and Kart 3  is: " + (kart1.distTo(kart3)) + " Meters.");
        System.out.println("The distance between Kart 2 and Kart 3  is: " + (kart2.distTo(kart3)) + " Meters.");

        System.out.println(" ");
        System.out.println("New positions: ");

        kart1.move((kart2.distTo(kart3)), 85);
        kart2.move(9.0, 125);
        kart3.move(5.5, 65);

        System.out.println(kart1);
        System.out.println(kart2);
        System.out.println(kart3);

        System.out.println(" ");
        System.out.println("new Distances");
        System.out.println("The distance between Kart 1 and Kart 2  is: " + (kart1.distTo(kart2)) + " Meters.");
        System.out.println("The distance between Kart 1 and Kart 3  is: " + (kart1.distTo(kart3)) + " Meters.");
        System.out.println("The distance between Kart 2 and Kart 3  is: " + (kart2.distTo(kart3)) + " Meters.");
    }
}
