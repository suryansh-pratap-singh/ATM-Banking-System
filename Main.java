public class Main {
    public static void main(String[] args){
        System.out.println("ATM Banking Management System");
        Account account1 = new Account("10001","Suryansh",5000);
        System.out.println(account1.getBalance());
        account1.deposit(2000);
        System.out.println(account1.getBalance());
        account1.withdraw(4000);
        System.out.println(account1.getBalance());
    }
}