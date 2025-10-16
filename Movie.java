//John Speer
//10/5/25
//An object of a movie, with variables for title, creator, date of release, price, and duration
public class Movie extends ItemForSale
{
    
    private String title;
    private Author creator;
    private String dor;
    private double price;
    private double duration;
    public Movie(String title,Author creator,String dor,double price,double duration){
        this.duration=duration;
        this.title=title;
        this.creator=creator;
        this.dor=dor;
        this.price=price;
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
    public String getDOR(){
        return dor;
    }
    //pre condition: duration has been set and this item has been initialized
    //post condition: return duration
    public double getDur(){
        return duration;
    }
}
