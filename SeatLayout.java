import java.util.Scanner;

// SeatLayout class: Manages the seating system for a selected movie show.
// Features include generating seat positions, displaying layout,
// handling seat booking, calculating total ticket cost,
// adding optional snack cost, applying GST, and printing final bill.
class SeatLayout
{
    Scanner sc = new Scanner(System.in);
    String[][] seats;
    int primeprice;
    int primeplusprice;
    int seatTotal = 0 ;

    // Constructor: Initializes the seat matrix (5 rows × 6 columns),
    // assigns seat labels from A1 to E6, and stores ticket prices
    // for Prime and Prime Plus categories for cost calculation.
    SeatLayout(int primeprice , int primeplusprice)
    {
        this.primeprice = primeprice;
        this.primeplusprice = primeplusprice;
        seats = new String[5][6];
        char row = 'A';
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                seats[i][j] = row + String.valueOf(j + 1);
            }
            row++;
        }
    }

    // displaySeats(): Shows the full seating layout to the user,
    // takes seat booking input, calculates total ticket cost,
    // optionally adds snack cost, applies GST, and prints final bill.
    void displaySeats()
    {
        System.out.println();
        System.out.println("Seat Layout: ");
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (j == 3)
                {
                    System.out.print(" |   ");
                }
                System.out.print(seats[i][j] + "  ");
            }
            System.out.println();
            if (i == 1)
            {
                System.out.println("Prime plus   |");
                System.out.println("             |");
                System.out.println("Prime        |");
            }
        }
        System.out.println();
        System.out.println("           Screen           ");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("Please enter the number of seats you want to book");
        int sn = sc.nextInt();
        while (sn < 1 || sn > 30)
        {
            System.out.println("Enter valid input between 1 to 30");
            sn = sc.nextInt();
        }
        System.out.println("Enter the Seats you want to book");
        for(int i = 0 ; i < 1 ; i++) {
            sc.nextLine();
        }
        int count = 0;

        while(count < sn)
        {
            System.out.print((count+1)+".) ");
            String ss = sc.nextLine().toUpperCase();

            if(calculateCost(ss))
            {
                count++;
            }
        }
        System.out.println("Are you interested to add some snacks to make you movie experience unforgettable \n true/false ");
        boolean ms = sc.nextBoolean();
        int snackCost = 0;
        if(ms)
        {
            Meal m = new Meal();
            int ffoodbill = m.show();
            System.out.println("Total Food Bill:"+ffoodbill);
            int net = seatTotal + ffoodbill;
            double gst = net * 0.05;
            double finalBill = net + gst;
            System.out.println("Seat Cost: " + seatTotal);
            System.out.println("Snack Cost: " + ffoodbill);
            System.out.println("GST: " + gst);
            System.out.println("Total Payable: " + finalBill);
            System.out.println();
            System.out.println("Kindly pay the bill");
            System.out.println();
            System.out.println("            ██████████████████  ████  ████  █████████████\n" +
                    "            ████ ▄▄▄▄▄ █▀▄█▀█ ▀▄ ▄█▀ ▀▄▀ ▄█ █ ▄▄▄▄▄ █████\n" +
                    "            ████ █   █ █▄ ▀▄▀ ▀█▀▀▄ ▄▀▄▀█ █▄█ █   █ █████\n" +
                    "            ████ █▄▄▄█ █▀█ ▀█ ▄▄ ▀ ▀▀ ▀▀▄█ ▀█ █▄▄▄█ █████\n" +
                    "            ████▄▄▄▄▄▄▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄▄▄▄▄▄▄▄█████\n" +
                    "            ████ ▀▄█ ▀▄▀ ▄▀█▄ ▀ ▀ ▀ ▀█▀▄ ▄ ▄▀▄▀▀▄▀ ▀█████\n" +
                    "            ████ ▄ ▀▄ ▀█▀ ▀ ▀ ▀▄ ▀█▀▄ ▀ ▀▀▀▄▀█ ▀█▀ ▀█████\n" +
                    "            ████▀▄▀█ ▀ ▄ ▀▄ ▀█▄▀ ▀ ▀▀ ▀▀▄ ▀▀ ▀▄ ▀▄ ▀█████\n" +
                    "            ████ ▀▄ ▀▄▀ ▀ ▀ ▀ ▀▄ ▀█ ▀▀ ▄ ▀▀ ▀ ▀ ▀ ▀▀█████\n" +
                    "            ████▄▄▄▄▄▄▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄▄▄█▄▄█▄█████\n" +
                    "            ████ ▄▄▄▄▄ █ ▀▀ ▀ ▄ ▀▀▀ ▀▄ ▀▀ ▀▀ ▄▀▄ ▄▀▄█████\n" +
                    "            ████ █   █ █▀ ▀▀▄▀ ▀▄ ▀ ▀ ▀▀▄▀ ▀▀ ▀▀ ▀▀▄█████\n" +
                    "            ████ █▄▄▄█ █ ▀ ▀ ▀▄ ▀ ▀ ▀▄ ▀ ▀▀ ▀ ▀▄ ▀▀▄█████\n" +
                    "            ██████████████████  ████  ████  █████████████\n");
            System.out.println("------------------------------Thank you for choosing MovieBox as your Movie partner------------------------------");
        }
        else
        {
            int net = seatTotal + snackCost;
            double gst = net * 0.05;
            double finalBill = net + gst;
            System.out.println("Seat Cost: " + seatTotal);
            System.out.println("Snack Cost: " + snackCost);
            System.out.println("GST: " + gst);
            System.out.println("Total Payable: " + finalBill);
            System.out.println();
            System.out.println("Kindly pay the bill");
            System.out.println();
            System.out.println("            ██████████████████  ████  ████  █████████████\n" +
                    "            ████ ▄▄▄▄▄ █▀▄█▀█ ▀▄ ▄█▀ ▀▄▀ ▄█ █ ▄▄▄▄▄ █████\n" +
                    "            ████ █   █ █▄ ▀▄▀ ▀█▀▀▄ ▄▀▄▀█ █▄█ █   █ █████\n" +
                    "            ████ █▄▄▄█ █▀█ ▀█ ▄▄ ▀ ▀▀ ▀▀▄█ ▀█ █▄▄▄█ █████\n" +
                    "            ████▄▄▄▄▄▄▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄▄▄▄▄▄▄▄█████\n" +
                    "            ████ ▀▄█ ▀▄▀ ▄▀█▄ ▀ ▀ ▀ ▀█▀▄ ▄ ▄▀▄▀▀▄▀ ▀█████\n" +
                    "            ████ ▄ ▀▄ ▀█▀ ▀ ▀ ▀▄ ▀█▀▄ ▀ ▀▀▀▄▀█ ▀█▀ ▀█████\n" +
                    "            ████▀▄▀█ ▀ ▄ ▀▄ ▀█▄▀ ▀ ▀▀ ▀▀▄ ▀▀ ▀▄ ▀▄ ▀█████\n" +
                    "            ████ ▀▄ ▀▄▀ ▀ ▀ ▀ ▀▄ ▀█ ▀▀ ▄ ▀▀ ▀ ▀ ▀ ▀▀█████\n" +
                    "            ████▄▄▄▄▄▄▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄█▄▄▄█▄▄█▄█████\n" +
                    "            ████ ▄▄▄▄▄ █ ▀▀ ▀ ▄ ▀▀▀ ▀▄ ▀▀ ▀▀ ▄▀▄ ▄▀▄█████\n" +
                    "            ████ █   █ █▀ ▀▀▄▀ ▀▄ ▀ ▀ ▀▀▄▀ ▀▀ ▀▀ ▀▀▄█████\n" +
                    "            ████ █▄▄▄█ █ ▀ ▀ ▀▄ ▀ ▀ ▀▄ ▀ ▀▀ ▀ ▀▄ ▀▀▄█████\n" +
                    "            ██████████████████  ████  ████  █████████████\n");
            System.out.println("------------Thank you for choosing MovieBox as your Movie partner------------");
        }
    }

    // calculateCost(): Validates the entered seat, checks if already booked,
    // marks it as booked, and adds the correct price to total based on row.
    // Rows A–B are Prime Plus, rows C–E are Prime.
    boolean calculateCost(String seat)
    {
        if (seat.length() < 2)
        {
            System.out.println("Invalid seat: " + seat);
            return false;
        }
        char rows = seat.charAt(0);
        if (rows < 'A' || rows > 'E')
        {
            System.out.println("Seat " + seat + " does not exist");
            return false;
        }
        int col = Integer.parseInt(seat.substring(1));
        if (col < 1 || col > 6)
        {
            System.out.println("Seat " + seat + " does not exist");
            return false;
        }
        int row = rows - 'A';
        int column = col - 1;

        if (seats[row][column].equals("X"))
        {
            System.out.println("Seat already booked. Choose another.");
            return false;
        }

        seats[row][column] = "X";

        if (rows == 'A' || rows == 'B')
        {
            seatTotal += primeplusprice;
        }
        else
        {
            seatTotal += primeprice;
        }
        return true;
    }
}