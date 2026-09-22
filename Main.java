public class Main {
    public static void main(String[] args){
        System.out.println("ATM Banking Management System");

        Account account1 = new Account("10001",5000);

        System.out.println(account1.getAccountNumber());

        System.out.println(account1.getBalance());

        account1.deposit(2000);
        System.out.println(account1.getBalance());

        account1.withdraw(4000);
        System.out.println(account1.getBalance());

        System.out.println();

        Customer customer1 = new Customer( "Mayank" ,  "9650838751" , "mayank9650@gmail.com" , "mayank07" , "test123" , account1);

        System.out.println("Name: " + customer1.getName());
        System.out.println("Mobile Number: " + customer1.getMobileNumber());
        System.out.println("Email: " + customer1.getEmail());
        System.out.println("Username: " + customer1.getUsername());
        System.out.println(customer1.getAccount().getBalance());
    } 
}