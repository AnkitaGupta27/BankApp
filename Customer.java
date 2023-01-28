package Banking;

import java.util.Random;
import java.util.Scanner;

public class Customer {

    Scanner sc = new Scanner(System.in);
    String name,cn,p;
    String username;
    String Pass;
    int age,acct;
    String ssn;
    String address;
    String email;
    long phone,num1;
    float balance = 0;
    public void openAcct(){
        System.out.println("Create a new account: ");
	System.out.println("Enter the name: ");
	name=sc.next();
	
	System.out.println("Enter the Username: ");
	username=sc.next();
       
	
	System.out.println("Enter the password: ");
	 Pass =sc.next();
          

	System.out.println("Enter the age: ");
	 age=sc.nextInt();
	
	System.out.println("Enter the SSN: ");
	 ssn= sc.next();
	
	System.out.println("enter the Address only city: ");
	 address=sc.next();
	
	System.out.println("Enter Email: ");
	 email=sc.next();
	
	System.out.println("Enter the phone Number: ");
	 phone=sc.nextLong();
     

    }
    public void login() {
                String username1="Ankita27";
                String pass="Ankita";
                System.out.print("Enter Username : ");
                 cn= sc.next();
                System.out.print("Enter Password : ");
                 p = sc.next();
                if(cn.equals(username1) && p.equals(pass)){
                            
        System.out.println("Please select the option :");
        System.out.print(" 1.Deposit \n 2.Withdrawal \n 3.Check Balance \n 4.Edit Profile \n 5.Change password \n 6.EXIT \n---> ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                deposit();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                editProfile();
                break;
            case 5:
                changePassword();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
                    }
                else if(cn.equals(username)&&p.equals(Pass)){
                    System.out.println("Please select the option :");
        System.out.print(" 1.Deposit \n 2.Withdrawal \n 3.Check Balance \n 4.Edit Profile \n 5.Change password \n 6.EXIT \n---> ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                deposit();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                editProfile();
                break;
            case 5:
                changePassword();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
                }
         else{
                        System.out.println("Invalid Username or Password!! Please try again.");
                        login();
                    }
        }
  

    public void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        double d = sc.nextDouble();
        balance += d;
        System.out.println("Rupees " + d + " deposited successfully!");
        System.out.println("Your current balance is Rupees " + balance);
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }
    }

    public void withdrawal() {
        System.out.print("Enter the amount you want to withdraw : ");
        int amt = sc.nextInt();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Rupees " + amt + " withdrawn successfully!!");
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void checkBalance() {
        System.out.println("You have rupees " + balance + " in your account");
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void editProfile() {
        System.out.println("Please select what do you want to edit: ");
        System.out.print(" 1.Name \n 2.Email \n 3.Username \n 4.Age \n 5.Address \n 6.Phone \n---> ");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.print("Enter the new Name : ");
                String a = sc.next();
                System.out.println("Name changed successfully!! \nNew Name is " + a);
                break;
            case 2:
                System.out.print("Enter the new Email : ");
                String e = sc.next();

                System.out.println("Email changed successfully!! \nNew Email is " + e);
                break;
            case 3:
                System.out.print("Enter the new UserName : ");
                String u = sc.next();
                System.out.println("Username changed successfully!! \nNew Username is " + u);
                break;
            case 4:
                System.out.print("Enter the new Age : ");
                int ag = sc.nextInt();
                System.out.println("Age changed successfully!! \nNew Age is " + ag);
                break;
            case 5:
                System.out.print("Enter the new Address : ");
                String ad = sc.next();

                System.out.println("Address changed successfully!! \n New Address is " + ad);
                break;
            case 6:
                System.out.print("Enter the new Phone : ");
                long p = sc.nextLong();
                System.out.println("Contact changed successfully!! \n New Contact is " + p);
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void changePassword() {
        System.out.println("Enter the old password ");
        String op = sc.next();
        if (op.equals(Pass)) {
            System.out.print("Enter the new Password : ");
            int pa = sc.nextInt();
            System.out.println("Password changed successfully!! \n New password is " + pa);
            System.out.print("Do you want to continue?(y/n)");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                login();
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("Wrong Password !");
        }
        System.exit(0);
    }

    public void exit() {
        System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
        System.exit(0);
    }
}
