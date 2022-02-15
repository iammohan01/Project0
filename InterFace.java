import java.util.Scanner ;
public class InterFace { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PasswordX check = new PasswordX();  // Object For PasswordX
        Account call = new Account();       // Object For Account Type
        

        check.password_Print_Line();
        int password_Enter = input.nextInt();

        if (check.checkpassword(password_Enter) == true ){ 
           call.list1();                  
                  
        } else ;
        

        

       

       
       
    


    input.close();
    }
}