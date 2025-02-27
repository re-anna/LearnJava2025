package hw2;

public class BankAccount {
    public static void main(String[] arg) {

        BankAccount firstOwner = new BankAccount("Иван Васильевич", 1928.3);

        firstOwner.printBalance();

        double amount = 290;

       firstOwner.withdraw(amount);

        firstOwner.printBalance();

        amount = 100;

        firstOwner.deposit(amount);

        firstOwner.printBalance();
    }

    String owner;
    double balance;



    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    double getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void setBalance( double newBalance){
        this.balance = newBalance;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount){
        return balance -= amount;
    }

    void printBalance(){
        System.out.println("Текущий баланс владельца счета " + owner +" равен " + balance);
    }
}
