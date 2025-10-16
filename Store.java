//John Speer
//10/5/25
//Object to keep track of a store and its inventory, which can be changed, or, shown the author's name of an item.
import java.util.ArrayList;

/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
public class Store
{
  double profit;
  ArrayList<ItemForSale> items=new ArrayList<>();
  public Store(){
    profit=0;
  }
  //pre condition:items has been initialized
  //post condition: prints out all of the items in list items
  public void showItems(){
    for(int i=0;i<items.size();i++){
      System.out.println(items.get(i).getTitle());
    }
  }
  //pre condition: item and items are initialized
  //post condition: adds item to list items 
  public void addItem(ItemForSale item){
    items.add(item);
    for(int i=0;i<items.size();i++){
      if(items.get(i).getTitle().compareTo(item.getTitle())>0){
        items.remove(item);
        items.add(i,item);

      }
    }
  }
  //pre condition: item is the title of an object in items
  //post condition: object with title item is removed from items, and the object's price is added to the store's total profit
  public void sellItem(String item){
    for(int i=0;i<items.size();i++){
      if(items.get(i).getCreator().getName().equals(item)){
        double temp=items.get(i).getPrice();
        items.remove(i);
        profit+=temp;
      }
    }
  }
  //pre condition: item is the title of an object in items
  //post condition: prints the object's author's name
  public void creator(String item){
    for(int i=0;i<items.size();i++){
      if(items.get(i).getTitle().equals(item)){
        System.out.println(items.get(i).getCreator().getName());
      }
    }
  }
}
