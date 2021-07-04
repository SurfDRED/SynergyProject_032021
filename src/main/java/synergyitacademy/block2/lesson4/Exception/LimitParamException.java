package synergyitacademy.block2.lesson4.Exception;

public class LimitParamException extends RuntimeException{
    public LimitParamException(String message) {
        System.out.println(message);
    }
}
