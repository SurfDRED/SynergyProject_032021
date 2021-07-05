package synergyitacademy.block2.lesson4.exception;

public class LimitSpeedException extends RuntimeException {
    public LimitSpeedException(String message) {
        System.out.println(message);
    }
}