package Exception;

public class NotEnoughBalanceException extends BankAccountException {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
