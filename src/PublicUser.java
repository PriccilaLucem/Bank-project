import interfaces.IUser;

public class PublicUser implements IUser {
    private String password;
    private Account account;
    
    
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getAccountNumber(){
        return account.getAccountNumber();
    }

    @Override
    public Double getBalance(){
        return this.account.getBalance();
    }
}
