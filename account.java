import java.util.Scanner;
public class account{
   static float balance=0;
   void deposit(){
       Scanner in=new Scanner(System.in);
       System.out.println("Enter amount to be Deposit");
       float d=in.nextFloat();
       balance=d+balance;
       System.out.println("DEPOSITED AMOUNT="+d);
       System.out.println("ACCOUNT BALANCE="+balance);

   }
   void withdraw(){
       Scanner in=new Scanner(System.in);

       System.out.println("Enter amount to Withdraw=");
       float w=in.nextFloat();
       balance=balance-w;
       System.out.println("Withdrawn Amount="+w);
       System.out.println("BALANCE="+balance);


   }
   public static void main(String[] args){
       account a=new account();
       a.deposit();
       a.withdraw();
       
   }
}
