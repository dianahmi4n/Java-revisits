import java.util.ArrayList;
public class even_nos{
    public static void main(String[] args) {
        
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int a = 2; a <200; a+=2){
            evenNumbers.add(a);
            }
            System.out.println("First 100 even numbers:" );
           System.out.println(evenNumbers);

        }
    }
