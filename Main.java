import java.util.*;
public class Main{
    public static void main(String[] args) {
        bank account = new bank(1, "Aditya", 10000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome: " + account.getName());
        System.out.println("Your account no is: " + account.getAcc_no());
        System.out.println("Initial balance: " + account.getBalance());

        System.out.println("\n Enter for deposit: ");
        double amt = sc.nextDouble();
        account.deposit(amt);

        System.out.println("\n Enter fir withdrawal: ");
        double wamt = sc.nextDouble();
        try{
            account.withdraw(wamt);
        } catch(InsufficientBalanceException e){
            System.out.println("Error: " + e.getMessage());
        }

        finally{
            System.out.println("Available balance: " + account.getBalance());
        }

        sc.close();
    }
}