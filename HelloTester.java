import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in); 
        // Step One
    System.out.println("Please enter your  name:  "); 
        // Step Two
    String name = input.nextLine(); 
        // Step Three
    Hello hi = new Hello(name); 
        // Step Four 
    hi.english(); 
    hi.spanish(); 
    hi.french(); 
   
    }
}