import interfaces.IUser;

public class User implements IUser{
    private String cpf;
    private String password;
    private Account account;

    public User(String cpf, String accountNumber, String password ){
        this.cpf = cpf;
        this.password = HashPassword.hashPassword(password);
    }

    @Override
    public String getAccountNumber() {
        return account.getAccountNumber();
    }
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = HashPassword.hashPassword(password);
    }

    @Override
    public Double getBalance(){
        return account.getBalance();
    }
}
