package synergyitacademy.block2.lesson4.Exception;

public class LimitOneSpeedException extends RuntimeException{
    public LimitOneSpeedException(String message) {
        System.out.println(message);
    }
}