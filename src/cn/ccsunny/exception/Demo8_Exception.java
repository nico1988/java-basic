package cn.ccsunny.exception;

public class Demo8_Exception {
    public static void main(String[] args) throws AgeOutOfBoundsException{
        throw new AgeOutOfBoundsException("年龄非法");
    }

}
class AgeOutOfBoundsException extends Exception{
    public AgeOutOfBoundsException() {
        super();
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }

    public AgeOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public AgeOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
