//John Speer
//10/5/25
//Tests "Store" methods and "Book" and "Movie" initialization
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book("PJO",new Author("RICK","2019"),"2019",17.99,"RIORDAN");
        s.addItem(b);
        s.creator("PJO");
        s.addItem(new Movie("La La land", new Author("director","1990"), "2019", 29.99, 1.5));
        s.creator("La La land");

         //String title,Author creator,String dor,double price,double duration/String publisher
     }
}
