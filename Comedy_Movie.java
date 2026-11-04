// Comedy_Movie class: Represents all Comedy genre movies.
// Stores details like movie names, cinema locations, show timings,
// ticket prices, and formats. Uses inherited methods from Movie
// class to display movie list and handle selection.
class Comedy_Movie extends Movie
{
    // Constructor: Initializes arrays with Comedy movie data.
    // Sets names, cinema halls, show timings, Prime and Prime Plus prices,
    // and screen formats. This data is later used by inherited methods
    // like show() and selectMovieC() during booking.
    Comedy_Movie()
    {
        names = new String[]{"Hera Pheri","Hera Pheri","Hera Pheri", "Dhamaal","Dhamaal","Dhamaal", "Golmaal","Golmaal","Golmaal"};
        cinemas = new String[]{"Rajhans Cinema" , "Apple Multiplex", "Neon Multiplex" , "Rajhans Cinema" , "Apple Multiplex", "Neon Multiplex" , "Rajhans Cinema" , "Apple Multiplex", "Neon Multiplex"};
        showtime = new String[]{"11:00 AM","12:00 PM","1:00 PM", "2:00 PM","3:00 PM","4:00 PM" , "5:00 PM","6:00 PM","7:00 PM"};
        Prime_price = new int[]{200,210,190, 250,260,240, 200,210,190};
        Prime_plus_price = new int[]{300,310,290 , 350,360,340, 300,310,290};
        Formate = new String[]{"2D","2D","2D", "3D","3D","3D", "2D","2D","2D"};
    }
}