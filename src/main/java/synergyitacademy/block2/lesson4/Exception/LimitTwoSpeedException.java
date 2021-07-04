package synergyitacademy.block2.lesson4.Exception;

public class LimitTwoSpeedException  extends RuntimeException{
    public LimitTwoSpeedException (String message) {
        System.out.println(message);
    }
}