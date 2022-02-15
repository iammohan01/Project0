import java.util.Scanner;

public class Savings {

    public int list(){
      String []options = new String[5];
        options[0] = "\nChoose options from below list : \n";
        options[1] = "Cash Withdrawl" ;
        options[2] = "Cash Deposit" ;
        options[3] = "Balance Check" ;
        options[4] = "Money Transfer \n \n Enter input Here :" ;

        System.out.println(options[0]);
        for(int i = 1 ; i < 5 ; i++){
            System.out.println(i+ " " + options[i]);
        }

        Scanner scanInput = new Scanner(System.in);

        return scanInput.nextInt();

        


    }
    
}