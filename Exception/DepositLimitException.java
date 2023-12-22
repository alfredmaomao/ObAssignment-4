package Exception;

public class DepositLimitException extends BankAccountException {
    public DepositLimitException(String message) {
        super(message);
    }
}
