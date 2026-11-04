// Action_Movie class: Represents all Action genre movies.
// Stores movie names, cinema locations, show timings,
// ticket prices, and screen formats. Inherits display and
// booking-related methods from the Movie class.
class Action_Movie extends Movie
{
    // Constructor: Initializes arrays with Action movie data.
    // Sets names, cinema halls, show timings, Prime and Prime Plus prices,
    // and formats. This data is used by inherited methods like
    // show() and selectMovieA() to display movies and proceed with booking.
    Action_Movie()
    {
        names = new String[]{"John Wick", "John Wick","John Wick","Mad Max","Mad Max","Mad Max", "Avengers" , "Avengers" , "Avengers"};
        cinemas = new String[]{"Nexon multiplex" , "Apple Multiplex", "Connplex" , "Nexon multiplex" , "Apple Multiplex", "Connplex", "Nexon multiplex" , "Apple Multiplex", "Connplex"};
        showtime = new String[] {"10:00 AM", "11:00 AM", "12:00 AM ", "2:00 PM" , "3:00 PM" , "4:00 PM" , "6:00 PM" , "7:00 PM" , "8:00 PM"};
        Prime_price = new int[] {270,260,275,  370,360,380, 550,540,560};
        Prime_plus_price = new int[] {370,360,375, 470,460,480, 650,640,660};
        Formate = new String[]{"3D","3D","3D", "IMAX 3D" ,"IMAX 3D" ,"IMAX 3D" , "4DX3D","4DX3D","4DX3D"};
    }
}