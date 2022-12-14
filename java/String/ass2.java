//How to check if two strings are the same ignoring their cases?//
public class CheckStringContentIgnoringCases 
 {
    public static void main(String[] args) 
    {
 
        String firstString = "My Name Is PAYAL!";
 
        String secondString = "my name is payal!";
 
        
        System.out.println("checking using equals() method : " + firstString.equals(secondString));
 
        
        System.out.println("checking using equalsIgnoreCase() method : " + firstString.equalsIgnoreCase(secondString));
    }
}