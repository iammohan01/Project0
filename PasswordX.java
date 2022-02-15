import java.util.Scanner;

public class PasswordX {

    public boolean password_check() {

        Scanner scan = new Scanner(System.in);
        Index list = new Index();
        Account call = new Account();

        System.out.print("Enter Your 4 digit Pin Number : "); 
        int password = scan.nextInt();;
   
    
            if (password == 2244) {
                System.out.println();   
                
                list.index_List();
                call.list1();

                return true ;}
            else {
                System.out.println("You Entered Wrong Pin Number");
                return false ;}
    }
    
}






