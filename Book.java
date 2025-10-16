//John Speer
//10/5/25
//An object of a book, with variables for title, creator, date of release, price, and publisher
public class Book extends ItemForSale
{
    private String title;
    private Author creator;
    private String dor;
    private double price;
    private String publisher;
    public Book(String title,Author creator,String dor,double price,String publisher){
        this.publisher=publisher;
        this.title=title;
        this.creator=creator;
        this.dor=dor;
        this.price=price;
    }
    public String getPublisher(){
        return publisher;
    }
    public double getPrice(){
        return price;
    }
    public String getTitle(){
        return title;
    }
    public Author getCreator(){
        return creator;
    }
    public String getDOB(){
        return creator.getDOB();
    }
    //precondition: dor has been set and this item has been initialized
    //postcondition: return dor
    public String getDOR(){
        return dor;
    }
}
