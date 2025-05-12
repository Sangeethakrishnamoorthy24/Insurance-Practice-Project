package exception;

public class InvalidPolicyException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidPolicyException(String message) {
        super(message);
    }
}

