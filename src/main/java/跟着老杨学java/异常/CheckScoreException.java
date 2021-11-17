package 跟着老杨学java.异常;

public class CheckScoreException extends RuntimeException {
    public CheckScoreException() {
    }

    public CheckScoreException(String message) {
        super(message);
    }


}
