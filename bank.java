import java.util.*;

import javax.naming.InsufficientResourcesException;
public class bank{
    private int acc_no;
    private String name;
    private double balance;

    bank(int acc_no, String name, double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money){
        balance += money;
        System.out.println("Money deposited. Available balance is: " + balance);
    }

    public void withdraw(double money) throws InsufficientBalanceException{
        if(balance<money){
            throw new InsufficientBalanceException("Insufficient balance");
        } else{
            balance -= money;
            System.out.println("Withdrawal successful!! Available balance is: " + balance);
        }
    }
}
