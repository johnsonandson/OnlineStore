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
    public String getDOB(){
        return this.dob;
    }
    public String getName(){
        return this.name;
    }
}
