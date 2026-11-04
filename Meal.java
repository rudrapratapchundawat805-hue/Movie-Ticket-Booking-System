import java.util.Scanner;

// Meal class: Handles snack ordering system for the movie booking.
// Features include displaying food menu, taking multiple orders,
// calculating total snack cost based on quantity, and returning final bill.
class Meal
{
    Scanner sc = new Scanner(System.in);

    // Price variables: Stores fixed cost of each snack item and combo.
    int Popcorn = 250;
    int Nachos =  200;
    int Coke =  100;
    int French_Fries = 140;
    int Combo1 = 300;
    int Combo2 = 250;

    // show(): Displays snack menu, allows user to order multiple items
    // by entering choice and quantity repeatedly, keeps adding cost,
    // and returns the final total snack bill when user exits.
    int show()
    {
        System.out.println("Menu");
        int totalbill=0;
        System.out.println("1. Popcorn - 250");
        System.out.println("2. Nachos - 200");
        System.out.println("3. Coke - 100");
        System.out.println("4. French Fries - 140");
        System.out.println();
        System.out.println("Value Meal");
        System.out.println("5. Combo 1 (Popcorn , Coke) - 300");
        System.out.println("6. Combo 2 (Nachos , Coke) - 250");
        System.out.println("0. Exit");

        while (true)
        {
            System.out.println("Enter the number to place order");
            int ch = sc.nextInt();
            if (ch == 0) break;

            switch (ch)
            {
                case 1: System.out.println("Enter popcorn quantity:");
                    totalbill+=sc.nextInt()*Popcorn;
                    break;
                case 2: System.out.println("Enter Nachos quantity ");
                    totalbill+=sc.nextInt()*Nachos;
                    break;
                case 3: System.out.println("Enter Coke quantity ");
                    totalbill+=sc.nextInt()*Coke;
                    break;
                case 4: System.out.println("Enter French fries quantity ");
                    totalbill+=sc.nextInt()*French_Fries;
                    break;
                case 5: System.out.println("Enter Combo 1 quantity ");
                    totalbill+=sc.nextInt()*Combo1;
                    break;
                case 6: System.out.println("Enter Combo 2 quantity ");
                    totalbill+=sc.nextInt()*Combo2;
                    break;
                default: System.out.println("Invalid");
            }
        }
        return totalbill;
    }
}