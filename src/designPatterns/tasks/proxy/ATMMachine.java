package designPatterns.tasks.proxy;

public class ATMMachine {

    private double balance = 0;

    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount + " added to account. Current balance: " + balance);
    }


}
