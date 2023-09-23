import java.util.Scanner;  
   
public class Atm
{  
  
    public static void main(String args[] )  
    {   
        int balance = 5000;
        int withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM INTERFACE");  
            System.out.println(" 1.Withdraw\n 2.Deposit\n 3.Check Balance\n 4.Exit");  
            System.out.print("Choose the option: ");  
            int choice = sc.nextInt();  

            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter amount to withdraw: ");  
                      
        withdraw = sc.nextInt();  
                      
  
        if(balance>=withdraw)  
        {  
          
            balance=balance - withdraw;  
            System.out.println("Please collect your money !");  
        }  
        else  
        {  
            
            System.out.println("Insufficient Balance...");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter amount to deposite: ");  
                      
   
        deposit = sc.nextInt();  
                      
        
        balance=balance + deposit;  
        System.out.println("Your amount has been successfully depsited...");  
        System.out.println("");  
        break;  
   
                case 3:  
   
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        
        System.out.println("COLLECT YOUR ATM CARD...\n THANK YOU FOR USING ATM MACHINE !");
        System.exit(0);  
            }  
        }  
    }  
}  