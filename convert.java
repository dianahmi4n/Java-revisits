import java.util.Scanner;
public class convert{ 
    public static void main(String[] args){

Scanner me = new Scanner(System.in);

System.out.println("Enter Word");
String input = me.nextLine();
       // String input = " Hello Joshua";

        //convert to uppercase
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        //find the length
        int length = input.length();
        System.out.println("Length: " + length);

        //display a substring from the third to the first character
         String substring = input .substring(2,5);
         System.out.println("Substring: " + substring);

    }
}