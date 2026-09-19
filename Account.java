public class Account {
    private String accountNumber;
    private String accountHolderName;
    private float balance;

    public float getBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }

    public void withdraw(float amount){
        if(amount<balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public Account(String accountNumber, String accountHolderName, float balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
}
