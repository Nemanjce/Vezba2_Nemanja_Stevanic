
package student;


public class Student {
    
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    
    public String getFirstName(){
    return firstName;
    }
    
    public void setFirstName(String firstName){
    this.firstName = firstName;
    }
    
    public String getLastName(){
    return lastName;}
    
    public void setLastName(String lastName){
    this.lastName = lastName;
           
    }
    
    public int getYearOfBirth(){
    return yearOfBirth;
    }
    public void setYearOfBirth(){
    this.yearOfBirth = yearOfBirth;
    }
    
    public void info(){
        System.out.println("First name : ");
        System.out.println("Last name : ");
        System.out.println("Year of birth : ");
    
    }
}
