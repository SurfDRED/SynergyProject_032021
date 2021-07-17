package synergyitacademy.block3.lesson7;

import synergyitacademy.block3.lesson7.logger.Logger;
import java.io.IOException;

public class Solution {
    private static Thread[] threads = new Thread[5];
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }
        try {
            Thread.sleep(65000); // Главный поток ждет завершения работы нитей, чтобы прочитать данные из лога
            Logger.printToConsole();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}