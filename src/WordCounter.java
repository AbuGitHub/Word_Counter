import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args)
    {
       //Keyboard object
       Scanner keyboard = new Scanner(System.in);
       
       //Program information display
       System.out.println("This is a word counting program.");
       
       //Get userInput
       System.out.println("Please enter a word, or multiple words to be counted:");
       String userInput = keyboard.nextLine();
       
       //Make a word counting variable, set value to 1 to account for first word
       int wordCount = 1;
       
       //For loop to read through string entered
       for(int i = 0; i < userInput.length(); i++)
       {
          //If statement: increment wordCount if charAt(i) is a blank space and the space next to it is another character
          if(userInput.charAt(i) == ' '  && userInput.charAt(i + 1) != ' ')
          {
             wordCount++;
          }
          
       }
       
          //Display word count
          System.out.println("Word count: " + wordCount);
          
    }


}
