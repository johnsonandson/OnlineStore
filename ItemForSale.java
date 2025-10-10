//John Speer
//10/5/25
//Parent class of Book and Movie classes, not used otherwise
public class ItemForSale
{
    private String title;
    private Author creator;
    private String dor;
    private double price;
    public ItemForSale(){
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
}
