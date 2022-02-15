public class PasswordX {

    void password_Print_Line() {

        System.out.print("Enter Your 4 digit Pin Number : "); }
    
    boolean checkpassword(int x){ 
        
            int password_input = x ; 
    
            if (password_input == 2244) {
                System.out.println();                
                return true ;}
            else {
                System.out.println("You Entered Wrong Pin Number");
                return false ;}
    }
    
}






