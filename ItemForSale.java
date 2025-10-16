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
    
  //pre condition: this item is initialized and price has been set
  //post condition:
    public double getPrice(){
        return price;
    }
  //pre condition:this item is initialized and the title has been set
  //post condition: return title
    public String getTitle(){
        return title;
    }
  //pre condition:this item is initialized and creator has been set
  //post condition: return creator
    public Author getCreator(){
        return creator;
    }
  //pre condition:this item is initialized and date of birth (dob) has been set
  //post condition: return dob
    public String getDOB(){
        return creator.getDOB();
    }
  //pre condition:this item is initialized and date of release (dor) has been set
  //post condition: return dor
    public String getDOR(){
        return dor;
    }
}
