import java.util.Scanner;

public class Index{
    public byte index_List() {
        System.out.println();
        String []options = new String[5];
        options[0] = "Choose options from below list : \n";
        options[1] = "Cash Withdrawl" ;
        options[2] = "Cash Deposit" ;
        options[3] = "Balance Check" ;
        options[4] = "Money Transfer" ;

        System.out.println(options[0]);
        for (byte i = 1 ; i <5 ; i++) System.out.println((i) + ". " +options[i]);

        Scanner input = new Scanner(System.in);
        byte option_Input = input.nextByte();
        input.close();
        return option_Input ; //
        
    }
}
