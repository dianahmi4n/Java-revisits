import java.util.Scanner;
public class psswrd{
    private String password;

    Scanner me = new Scanner(System.in);

    //constructor to intiate the password
    public psswrd(String password){
        this.password = password;
    }
    //method  to securely sent the password
    public void setPassword(String newPassword){
        System.out.println("Enter password");
        String password = me.nextLine();
        //validate the new password(eg check length,complexity)
         if(newPassword.length()>=8){
            this.password = newPassword;
         }
         //ifelse(newPassword.length()>=8){
            //System.out.println("Password must be atleast 8 characters long");
         
         else{
            System.out.println("Enter password again:");

         }
    }
    //method to securely get the password
    public String getPassword(){
        //return the ecrypted version of the password(lets return the original password)
         return password;
    }

    public static void main(String[] args) {
        //create a user object with a password
    
 psswrd user = new psswrd("");

 //test the setpassword and get password methods
 user.setPassword("");
 System.out.println("Password: " + user.getPassword());

    }
}