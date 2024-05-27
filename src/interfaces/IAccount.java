package interfaces;

public interface IAccount {
    Double withdraw(Double value);
    Double depposit(Double value);
    Double getBalance();
    String getAccountNumber();

}
