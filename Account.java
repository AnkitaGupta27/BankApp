
package Banking;

import java.util.Scanner;

public class Account {
     long accountid;
   String description;
   int minimumbalance;
   Scanner sc =new Scanner(System.in);
 Bank b=new Bank();
   
   public void display() {
	   System.out.println("Types of Account you can apply for: ");
	   System.out.println("1.Saving \n2.Current\n3.Back");
	   int ch=sc.nextInt();
	   switch(ch){
               case 1:
		   Account a1=new Saving();
		   a1.display();
                   
                   
                   break;
               case 2:
		   Account a2;
                   a2= new CurrentAcc();
		   a2.display();
                   break;
               case 3:
		   Customer c=new Customer();
		   c.openAcct();
                   break;
               default:
		   System.out.println("Invalid input \nTRY AGAIN!!");
                   break;
   }
   }
}