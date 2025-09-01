class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static BankAccount deposit(BankAccount value, double ammount) {
        return new BankAccount(value.accountNumber, value.accountHolderName, value.balance + ammount);
    }
    
    public static BankAccount Withdraw(BankAccount value, double ammount) {
        return new BankAccount(value.accountNumber, value.accountHolderName, value.balance - ammount);
    }
    public void display(){
        System.out.println(accountNumber+" "+accountHolderName+" "+balance);
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(241560, "Pratik", 25000);
        BankAccount b2 = new BankAccount(241561, "Saksham", 30000);

        BankAccount update = deposit(b1, 10000);
        BankAccount update2 = Withdraw(b1, 10000);
        BankAccount update3 = deposit(b2, 10000);
        BankAccount update4 = Withdraw(b2, 10000);
        update.display();
        update2.display();
        update3.display();
        update4.display();
    }
}