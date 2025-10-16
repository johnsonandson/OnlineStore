//John Speer
//10/5/25
//An object of an author, with name and date of birth, as well as methods to get them
public class Author
{
    private String name;
    private String dob;
    public Author(String name, String dob){
        this.name=name;
        this.dob=dob;
    }
    //pre condition: dob has been set and this item have been initialized
    //post condition: return dob
    public String getDOB(){
        return this.dob;
    }
    //pre condition: name has been set and this item has been initialized
    //post condition:
    public String getName(){
        return this.name;
    }
}
