import java.util.Scanner;
public class casing{
    public static void main(String[]args){
    Scanner me = new Scanner(System.in);
        System.out.println("Hey Joshua,Input any number(1-7): ");
        int day = me.nextInt();

        switch(day){
            case 1:
                System.out.println("Its a Monday");
                break;
                case 2:
                    System.out.println("Its a Tuesday");
                    break;
                    case 3:
                        System.out.println("Its a Wednesday");
                        break;
                    case 4:
                System.out.println("Its a Thursday");
             case 5:
                System.out.println("Its a Friday");
            break;  
        case 6:
            System.out.println("Its a Saturday");
        break;
    case 7:
        System.out.println("Its a Sunday");
    break;  
    default:
    System.out.println("unknown");           
        }


    }

}