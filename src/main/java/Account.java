public class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;

    }

    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("Nicht genug Geld!");

        }

    }

    public double checkBalance(){
        return balance;

    }

    public void transfer(double amount, Account anotherAccount){
        if (amount <= balance) {
            withdraw(amount);
            anotherAccount.deposit(amount);
        }else{
            System.out.println("Nicht genug geld für die Überweisung");
        }


    }

}


