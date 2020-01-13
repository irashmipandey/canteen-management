import java.io.*;
import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.*;
public class CanteenManagement {
    public static void welcome() {

        System.out.println("Welcome to the Canteen!");
        System.out.println("Anything from drinks?");
        System.out.println("Cold Drink:40, Tea:20, Coffee:25");
        System.out.println("Enter name as in same format as written above");
    }
    public static void menu() {
        System.out.println("********Eatables********");
        System.out.println("Veg Roll:25, Chilly Potato:70, Maggi:30");
    }
    public static void methodofpayment() {
        System.out.println("How would you like to pay?");
        System.out.println("1.Cash 2.Card 3.Add to your monthly account");
        Scanner obj= new Scanner(System.in);
        int meth=obj.nextInt();
        switch(meth){
            case 1: System.out.println("You may proceed to the cashier.");
                    System.out.println("Your bill has been paid successfully"); break;
            case 2: System.out.println("Please swipe your card and enter the PIN.");
                    System.out.println("Your bill has been paid successfully."); break;
            case 3: System.out.println("Please enter your student number.");
                    System.out.println("The amount is successfully added to your acccount"); break;
            default:System.out.println("Sorry! This method of payment is not available here.");
        }
        
    }
    public static void thanks() {
        System.out.println("Thanks for visiting!");
        System.out.println("We appreciated your presence here!");
        System.out.println("Hope to see you again in future");
        System.out.println("*********************************");
    }
    public static void menufinal() {
        System.out.println("Cold Drink:40, Tea:20, Coffee:25, Veg Roll:25, Chilly Potato:70, Maggi:30");
        System.out.println("Enter name as in same format as written above");
    }
    

public static void main (String[] args) {
    HashMap<String, Integer> menud = new HashMap<String, Integer>();
        menud.put("Cold Drink", 40);
        menud.put("Tea", 20);
        menud.put("Coffee", 25);
        welcome();
        Scanner obj=new Scanner(System.in);
        String i= obj.nextLine();
        System.out.println("Enter the quantity of drink");
        int numd=obj.nextInt();
        System.out.println("Your bill is :"+numd*menud.get(i));
        System.out.println("Press Y to display the menu or press any random key to checkout");
        char charact= obj.next().charAt(0);
        if(charact=='Y' || charact=='y')
            {System.out.println("Here's the menu card");
            menu();}
            else
            {System.out.println("Let's proceed to Checkout");
            methodofpayment();
            thanks(); 
            System.exit(0);}
    HashMap<String, Integer> menue = new HashMap<String, Integer>();
        menue.put("Veg Roll", 25);
        menue.put("Chilly Potato", 70);
        menue.put("Maggi", 30);
        System.out.println("Enter name as in same format as written above");
        Scanner obj1=new Scanner(System.in);
        String j=obj1.nextLine();
        System.out.println("Enter the quantity of eatable");
        int nume=obj1.nextInt();
        int bill=numd*menud.get(i) + nume*menue.get(j);
        System.out.println("Your bill is"+" "+bill);
        methodofpayment();
        System.out.println("Anything Else?");
        System.out.println("Press Y to exit or any random key to order");
        char charact1= obj.next().charAt(0);
        {if(charact1=='Y' || charact1=='y')
            {System.out.println("Thanks for your order");
            thanks();
            System.exit(0);}
            else
            {HashMap<String, Integer> menuf = new HashMap<String, Integer>();
             menuf.put("Veg Roll", 25);
             menuf.put("Chilly Potato", 70);
             menuf.put("Maggi", 30);
             menuf.put("Cold Drink", 40);
             menuf.put("Tea", 20);
             menuf.put("Coffee", 25);
             menufinal();
             Scanner obj2=new Scanner(System.in);
             String k=obj2.nextLine();
             System.out.println("Enter the quantity of eatable");
             int numf=obj2.nextInt();
             int billf=numd*menud.get(i) + nume*menue.get(j) + numf*menuf.get(k);
             System.out.println("Your bill is"+" "+bill);
             methodofpayment();
             thanks();
             System.exit(0);}
            }

}
}
