public class Index{
        
    public byte index_List() { 
        String []options = new String[5];
        options[0] = "\n\nChoose options from below list : \n";
        options[1] = "Cash Withdrawl \n" ;
        options[2] = "Cash Deposit \n" ;
        options[3] = "Balance Check \n" ;
        options[4] = "Money Transfer \n \nEnter input Here :" ;

            System.out.println(options[0]);
        for(int i = 1 ; i < 5 ; i++){
            System.out.print( i + ". "+ options[i]);
        }return 0 ; 

    }

       
        
       
        

        //return 0 ;

    }
