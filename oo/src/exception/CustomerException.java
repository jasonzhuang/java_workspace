package exception;

public class CustomerException extends Exception {

    private static final long serialVersionUID = 1L;

    public CustomerException() {
        super();
    }

    public CustomerException(String s) {
        super(s);
    }
    
}
