public class Account {
    private String accountNumber;
    private float balance;

    public float getBalance(){
        return balance;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void withdraw(float amount){
        if(amount<=balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public Account(String accountNumber,  float balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
