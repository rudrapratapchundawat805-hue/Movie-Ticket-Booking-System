import java.util.Scanner;
class Movie
{
    String[] names;
    String[] showtime;
    String[] cinemas;
    String[] Formate;
    int[] Prime_price;
    int[] Prime_plus_price;
    Scanner sc = new Scanner(System.in);

    // Main method: Entry point of the program.
    // Displays welcome message, asks user to choose language,
    // and directs to Hindi or English movie section.
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        Movie obj1 = new Movie();
        System.out.println("                              *******************                              ");
        System.out.println("------------------------------WELCOME TO MOVIEBOX------------------------------");
        System.out.println("                              *******************                              ");
        System.out.println("Enter the language in which you would prefer to watch movie \n 1.) Hindi \n 2.) English");
        int ln = sc.nextInt();
        switch(ln)
        {
            case 1 : System.out.println("You have selected Hindi");
                obj1.hindi();
                break;

            case 2 : System.out.println("You have selected English");
                obj1.English();
                break;

            default : System.out.println("Please enter valid input");
        }
    }

    // show(): Displays the list of movies with their showtime, cinema,
    // ticket prices and format using arrays.
    void show()
    {
        for (int i = 0; i < names.length; i++)
        {
            System.out.println((i + 1)+".)" + names[i] + " | " + showtime[i] + " | "+cinemas[i] + " | Rs." + Prime_price[i]+ ","+ Prime_plus_price[i] +" | " + Formate[i]);
        }
    }

    // selectMovieA(): Takes user choice for Action movies.
    // Shows full details of selected show and opens seat layout
    // with correct pricing for booking.
    void selectMovieA()
    {
        System.out.println("Enter the number alloted to movie to book you tickets");
        int n = sc.nextInt();

        switch(n)
        {
            case 1 : System.out.println("Your movie details are:- ");
                System.out.println("Name: john Wick");
                System.out.println("Cinema: Nexon multiplex");
                System.out.println("Show time: 10:00 AM");
                System.out.println("Price:- Prime:- 270 , Prime Plus:- 370");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatj = new SeatLayout(270 , 370);
                seatj.displaySeats();
                break;

            case 2 : System.out.println("Your movie details are:- ");
                System.out.println("Name: john Wick");
                System.out.println("Cinema: Apple multiplex");
                System.out.println("Show time: 11:00 AM");
                System.out.println("Price:- Prime:- 260 , Prime Plus:- 360");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatj1 = new SeatLayout(260 , 360);
                seatj1.displaySeats();
                break;

            case 3 : System.out.println("Your movie details are:- ");
                System.out.println("Name: john Wick");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 12:00 AM");
                System.out.println("Price:- Prime:- 275 , Prime Plus:- 375");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatj2 = new SeatLayout(275 , 375);
                seatj2.displaySeats();
                break;

            case 4 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Mad Max");
                System.out.println("Cinema: Nexon Multiplex");
                System.out.println("Show time: 2:00 PM");
                System.out.println("Price:- Prime:- 370 , Prime Plus:- 470");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatm = new SeatLayout(370 , 470);
                seatm.displaySeats();
                break;

            case 5 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Mad Max");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 3:00 PM");
                System.out.println("Price:- Prime:- 360 , Prime Plus:- 460");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatm1 = new SeatLayout(360 , 460);
                seatm1.displaySeats();
                break;

            case 6 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Mad Max");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 4:00 PM");
                System.out.println("Price:- Prime:- 380 , Prime Plus:- 480");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatm2 = new SeatLayout(380 , 480);
                seatm2.displaySeats();
                break;

            case 7 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Avengers");
                System.out.println("Cinema: Nexon Multiplex");
                System.out.println("Show time: 6:00 PM");
                System.out.println("Price:- Prime:- 550 , Prime Plus:- 650");
                System.out.println("Formate:  4DX3D");
                System.out.println();
                SeatLayout seata = new SeatLayout(550 , 650);
                seata.displaySeats();
                break;

            case 8 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Avengers");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 7:00 PM");
                System.out.println("Price:- Prime:- 540 , Prime Plus:- 640");
                System.out.println("Formate:  4DX3D");
                System.out.println();
                SeatLayout seata1 = new SeatLayout(540 , 640);
                seata1.displaySeats();
                break;

            case 9 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Avengers");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 8:00 PM");
                System.out.println("Price:- Prime:- 560 , Prime Plus:- 660");
                System.out.println("Formate:  4DX3D");
                System.out.println();
                SeatLayout seata2 = new SeatLayout(560 , 660);
                seata2.displaySeats();
                break;

            default: System.out.println("Kindly enter the valid input");
        }
    }

    // selectMovieC(): Handles selection and booking flow for Comedy movies.
    // Displays selected show details and opens seat layout with price.
    void selectMovieC()
    {
        System.out.println("Enter the number alloted to movie to book you tickets");
        int n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Hera Pheri");
                System.out.println("Cinema: Rajhans Cinema");
                System.out.println("Show time: 11:00 AM");
                System.out.println("Price:- Prime:- 200 , Prime Plus:- 300");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seath = new SeatLayout(200 , 300);
                seath.displaySeats();
                break;

            case 2 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Hera Pheri");
                System.out.println("Cinema: Apple multiplex");
                System.out.println("Show time: 12:00 PM");
                System.out.println("Price:- Prime:- 210 , Prime Plus:- 310");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seath1 = new SeatLayout(210 , 310);
                seath1.displaySeats();
                break;

            case 3 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Hera Pheri");
                System.out.println("Cinema: Neon Multiplex");
                System.out.println("Show time: 1:00 PM");
                System.out.println("Price:- Prime:- 190 , Prime Plus:- 290");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seath2 = new SeatLayout(190 , 290);
                seath2.displaySeats();
                break;

            case 4 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Dhamaal");
                System.out.println("Cinema: Rajhans Cinema");
                System.out.println("Show time: 2:00 PM");
                System.out.println("Price:- Prime:- 250 , Prime Plus:- 350");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatd = new SeatLayout(250 , 350);
                seatd.displaySeats();
                break;

            case 5 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Dhamaal");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 3:00 PM");
                System.out.println("Price:- Prime:- 260 , Prime Plus:- 360");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatd1 = new SeatLayout(260 , 360);
                seatd1.displaySeats();
                break;

            case 6 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Dhamaal");
                System.out.println("Cinema: Neon Multiplex");
                System.out.println("Show time: 4:00 PM");
                System.out.println("Price:- Prime:- 240 , Prime Plus:- 340");
                System.out.println("Formate: 3D");
                System.out.println();
                SeatLayout seatd2 = new SeatLayout(240 , 340);
                seatd2.displaySeats();
                break;

            case 7 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Golmaal");
                System.out.println("Cinema:  Rajhans Cinema");
                System.out.println("Show time: 5:00 PM");
                System.out.println("Price:- Prime:- 200 , Prime Plus:- 300");
                System.out.println("Formate:  2D");
                System.out.println();
                SeatLayout seatg = new SeatLayout(200 , 300);
                seatg.displaySeats();
                break;

            case 8 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Golmaal");
                System.out.println("Cinema:Apple Multiplex");
                System.out.println("Show time: 6:00 PM");
                System.out.println("Price:- Prime:- 210 , Prime Plus:- 310");
                System.out.println("Formate:  2D");
                System.out.println();
                SeatLayout seatg1 = new SeatLayout(210 , 310);
                seatg1.displaySeats();
                break;

            case 9 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Golmaal");
                System.out.println("Cinema: Neon Multiplex");
                System.out.println("Show time: 7:00 PM");
                System.out.println("Price:- Prime:- 190 , Prime Plus:- 290");
                System.out.println("Formate:  2D");
                System.out.println();
                SeatLayout seatg2 = new SeatLayout(190 , 290);
                seatg2.displaySeats();
                break;

            default: System.out.println("Kindly enter the valid input");
        }
    }

    // selectMovieH(): Handles selection and booking flow for Horror movies.
    // Shows movie details and opens seat layout for chosen show.
    void selectMovieH()
    {
        System.out.println("Enter the number allotted to movie to book you tickets");
        int n = sc.nextInt();

        switch(n)
        {
            case 1 : System.out.println("Your movie details are:- ");
                System.out.println("Name: The Nun");
                System.out.println("Cinema: Nexon Multiplex");
                System.out.println("Show time: 9:00 PM");
                System.out.println("Price:- Prime:- 300 , Prime Plus:- 400");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seatn = new SeatLayout(300 , 400);
                seatn.displaySeats();
                break;

            case 2 : System.out.println("Your movie details are:- ");
                System.out.println("Name: The Nun");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 10:00 PM");
                System.out.println("Price:- Prime:- 320 , Prime Plus:- 420");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seatn1 = new SeatLayout(320 , 420);
                seatn1.displaySeats();
                break;

            case 3 : System.out.println("Your movie details are:- ");
                System.out.println("Name: The Nun");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 11:00 PM");
                System.out.println("Price:- Prime:- 310 , Prime Plus:- 410");
                System.out.println("Formate: 2D");
                System.out.println();
                SeatLayout seatn2 = new SeatLayout(310 , 410);
                seatn2.displaySeats();
                break;

            case 4 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Conjuring");
                System.out.println("Cinema: Nexon Multiplex");
                System.out.println("Show time: 11:00 PM");
                System.out.println("Price:- Prime:- 350 , Prime Plus:- 450");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatc = new SeatLayout(350 , 450);
                seatc.displaySeats();
                break;

            case 5 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Conjuring");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 12:00 AM");
                System.out.println("Price:- Prime:- 370 , Prime Plus:- 470");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatc1 = new SeatLayout(370 , 470);
                seatc1.displaySeats();
                break;

            case 6 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Conjuring");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 11:00 PM");
                System.out.println("Price:- Prime:- 360 , Prime Plus:- 460");
                System.out.println("Formate: IMAX 3D");
                System.out.println();
                SeatLayout seatc2 = new SeatLayout(360 , 460);
                seatc2.displaySeats();
                break;

            case 7 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Insidious");
                System.out.println("Cinema: Nexon Multiplex");
                System.out.println("Show time: 10:30 PM");
                System.out.println("Price:- Prime:- 330 , Prime Plus:- 430");
                System.out.println("Formate:  3D");
                System.out.println();
                SeatLayout seati = new SeatLayout(330, 430);
                seati.displaySeats();
                break;

            case 8 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Insidious");
                System.out.println("Cinema: Apple Multiplex");
                System.out.println("Show time: 11:30 PM");
                System.out.println("Price:- Prime:- 350 , Prime Plus:- 450");
                System.out.println("Formate:  3D");
                System.out.println();
                SeatLayout seati1 = new SeatLayout(350, 450);
                seati1.displaySeats();
                break;

            case 9 : System.out.println("Your movie details are:- ");
                System.out.println("Name: Insidious");
                System.out.println("Cinema: Connplex");
                System.out.println("Show time: 12:30 PM");
                System.out.println("Price:- Prime:- 340 , Prime Plus:- 440");
                System.out.println("Formate:  3D");
                System.out.println();
                SeatLayout seati2 = new SeatLayout(340, 440);
                seati2.displaySeats();
                break;

            default: System.out.println("Kindly enter the valid input");
        }
    }

    // hindi(): Handles Hindi language flow.
    // Asks user to choose genre, shows movies for that genre,
    // and calls the appropriate selection method.
    void hindi()
    {
        System.out.println("                                                                          ");
        System.out.println("Please select the Genres you are interested in \n1.) Action \n2.) Comedy \n3.) Horror");
        int gn = sc.nextInt();
        switch (gn)
        {
            case 1 : System.out.println("You have selected Action Film \n    Great choice indeed");
                System.out.println();
                Action_Movie action = new Action_Movie();
                action.show();
                action.selectMovieA();
                break;
            case 2 : System.out.println("You have selected Comedy Film \n    Great choice indeed");
                System.out.println();
                Comedy_Movie comedy = new Comedy_Movie();
                comedy.show();
                comedy.selectMovieC();
                break;
            case 3: System.out.println("You have selected Horror Film \n     Great choice indeed");
                System.out.println();
                Horror_Movie horror = new Horror_Movie();
                horror.show();
                horror.selectMovieH();
                break;
            default: System.out.println("Please enter valid Input");
        }
    }

    // English(): Same as hindi(), but for English language movies.
    // Lets user choose genre and continues booking flow.
    void English()
    {
        System.out.println("                                                                          ");
        System.out.println("Please select the Genres you are intrusted in \n1.) Action \n2.) Comedy \n3.) Horror");
        int gn = sc.nextInt();
        switch (gn)
        {
            case 1 : System.out.println("You have selected Action Film \n    Great choice indeed");
                System.out.println();
                Action_Movie action = new Action_Movie();
                action.show();
                action.selectMovieA();
                break;
            case 2 : System.out.println("You have selected Comedy Film \n    Great choice indeed");
                System.out.println();
                Comedy_Movie comedy = new Comedy_Movie();
                comedy.show();
                comedy.selectMovieC();
                break;
            case 3: System.out.println("You have selected Horror Film \n     Great choice indeed");
                System.out.println();
                Horror_Movie horror = new Horror_Movie();
                horror.show();
                horror.selectMovieH();
                break;
            default: System.out.println("Please enter valid Input");
        }
    }
}