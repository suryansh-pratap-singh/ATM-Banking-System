public class Customer {
    private String name;
    private String mobileNumber;
    private String email;
    private String username;
    private String password;
    private Account account;

    public Customer(String name , String mobileNumber , String email , String username , String password , Account account){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.username = username;
        this.password = password;
        this.account = account;
    }

    public String getName(){
        return name;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public Account getAccount(){
        return account;
    }
}
