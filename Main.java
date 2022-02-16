import java.util.Scanner ;
public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PasswordX check = new PasswordX();  // Object For PasswordX
        Account call = new Account();       // Object For Account Type
        Index list = new Index();           // Objct for index 
        Savings savings= new Savings();    // object for savings 


        System.out.print("Enter Your 4 digit Pin Number : ");
        int get_password = input.nextInt();  // getting password 
         

        if (check.password_check(get_password)==true){     // passing password & check that is true or false
        call.Acc_type();                                       // calling Acc Type 
        
        System.out.print("Enter Account Type : ");
        byte get_acc_type = input.nextByte();      // getting Acc type

        list.index_List();
        byte index_option  = input.nextByte();  // creating variable from return value of index option

            switch(get_acc_type){
                case 1 :  
                        switch(index_option) {
                                case 1 :   // Cash Withdrawn Area 
                                         {savings.amount(0);  // Calling Bank Balance

                                         System.out.print("\nEnter the amount you want to withdraw : ");

                                         float withdraw_amount = input.nextFloat();  //  getting input that amount to withdraw
                                         savings.cash_withdrawl(withdraw_amount); }     break;  // passing amount to withdraw method 

                                case 2 : // Cash Deposit Area
                                            {savings.amount(0);

                                            System.out.print("\nEnter the amount do you want to deposit : ");

                                            float deposit_amount = input.nextFloat();
                                            savings.cash_deposit(deposit_amount); }     break ;

                                            
                                case 3 :    
                                             savings.amount(0); break ;
                                case 4 : 
                                             System.out.println("\nMoney Transfer Currently Unavailable\n"); break ;  
                        }
                

                
                case 2 : break ;
            }

    }

    
        
    
    }
}