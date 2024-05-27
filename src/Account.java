import interfaces.IAccount;
public class Account implements IAccount {
    private String accountNumber;
    private Double balance;


    @Override
    public Double withdraw(Double value){
        balance -= value - 5;
        return balance;
    };

    @Override 
    public Double depposit(Double value){
        balance += value;
        return balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
