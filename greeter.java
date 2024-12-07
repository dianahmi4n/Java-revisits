import java.util.Scanner;
public class greeter{
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        System.out.println("Enter name: ");
        Stringname = me . nextString();
       // greetUser("Joshua");
        greetUser();
    }
    public static void greetUser(String name){
        System.out.println("Hello " +  name);

    }
    public static void greetUser(){
        System.out.println("Hello you are welcome");
    }
}