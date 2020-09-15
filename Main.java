import java.util.Scanner;
/**
 *Greets the user and calculates their approximate age
 * @author Khazina
 */
public class Main {
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for a user input
    Scanner input = new Scanner(System.in);

    //Ask the user for their name
    System.out.println("Please enter your name");

    //Declare a variable to store the name of the user
    String name;

    //Get input for the users name
    name = input.nextLine();

    //Greet the user 
    System.out.println("Hello " + name + "!");

    //Declare and initialize the current year constant
    final int CURRENT_YEAR = 2020;

    //Prompt the user to enter their birth year
    System.out.println("Please enter the year you were born");

    //Get the users birth year
    int birthYear = input.nextInt();

    //Calculate the approximate age
    int age = CURRENT_YEAR - birthYear;

    //Tell the user their approximate age
    System.out.println("You are " + age + " years old.");
    
  }
}
