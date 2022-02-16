public class Savings {

    protected void amount(float x){
      
        float bank_balance = 0.0f + x ;
        System.out.println("\nYour Bank Balance : " + bank_balance );

    }

    protected void cash_withdrawl(float withdraw_amount){

        System.out.println("\n\n"+withdraw_amount + " Withdrawn Success Fully ! \nNow");
        amount(0-withdraw_amount);
       
    }

    protected void cash_deposit(float deposit_amount){
        System.out.println("\n\n"+deposit_amount + " Withdrawn Success Fully ! \nNow");
        amount(0+deposit_amount);

    } 

    
}