package Exception;

public class WithdrawLimitException extends BankAccountException {
    public WithdrawLimitException(String message) {
        super(message);
    }
}
