// Horror_Movie class: Represents all Horror genre movies.
// Stores details like movie names, cinemas, show timings,
// ticket prices, and formats. Inherits display and selection
// functionality from the Movie class.
class Horror_Movie extends Movie
{
    // Constructor: Initializes arrays with Horror movie data.
    // Sets names, cinema halls, show timings, Prime and Prime Plus prices,
    // and screen formats. This information is used by inherited methods
    // such as show() and selectMovieH() to display and process bookings.
    Horror_Movie()
    {
        names = new String[]{"The Nun","The Nun","The Nun", "Conjuring","Conjuring","Conjuring", "Insidious","Insidious","Insidious"};
        cinemas = new String[]{"Nexon Multiplex", "Apple Multiplex", "Connplex" , "Nexon Multiplex", "Apple Multiplex", "Connplex" , "Nexon Multiplex", "Apple Multiplex", "Connplex"};
        showtime = new String[]{"9:00 PM","10:00 PM","11:00 PM", "11:00 PM","12:00 AM","1:00 AM", "10:30 PM","11:30 PM","12:30 PM"};
        Prime_price = new int[]{300,320,310, 350,370,360, 330,350,340};
        Prime_plus_price = new int[]{400,420,410, 450,470,460, 430,450,440};
        Formate = new String[]{"2D","2D","2D", "IMAX 3D","IMAX 3D","IMAX 3D", "3D","3D","3D"};
    }
}