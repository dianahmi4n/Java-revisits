/*public class mult{
    public static void main(String[] args) {
        
        int m;
        int j;
        System.out.println("MULTIPLICATION TABLE");

        for(m=1;m<13;m++){
            //System.out.print( m + "");
           
        

         for(j=1;j<13;j++){
                    System.out.println(j+ " x " + m + " = " + (j*m));
            }
    }
}
}*/
import java.util.Scanner;
public class mult{
    public static void main(String[] args){

        Scanner me = new Scanner(System.in);
    
        System.out.println("Enter Number: ");
        int number = me.nextInt();

        for(int m = 1; m <= 13;){

            System.out.println(number + " x " + m + " = "+ (number * m) );
        }
    }
}