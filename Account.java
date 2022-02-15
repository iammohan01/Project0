import java.util.Scanner;

public class Account {

    public byte list1() {
        
        String []print_Line_For_Type = new String[3];
        print_Line_For_Type[0] = "Select Account Type : \n" ;
        print_Line_For_Type[1] = "1.Savings" ;
        print_Line_For_Type[2] = "2.Current\n" ;
        
            for (byte i = 0 ; i<3 ; i++) System.out.println(print_Line_For_Type[i]);

        
        System.out.print("Enter Account Type : ");
        Scanner input = new Scanner(System.in);
        byte account_type = input.nextByte();

        System.out.println();

        input.close();

        Index listIndex = new Index();      // Object For Index 
        listIndex.index_List();

        return account_type ;
        
        }
          
    }
