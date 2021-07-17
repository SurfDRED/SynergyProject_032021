package synergyitacademy.block3.lesson7;

import lombok.SneakyThrows;
import synergyitacademy.block3.lesson7.logger.Logger;

import java.util.Date;
import java.util.Random;

public class MyThread extends Thread {
    private final Logger logger = new Logger();
    private final static Random random = new Random();

    @SneakyThrows
    @Override
    public void run() {
        long endTime = System.currentTimeMillis() + 60000;
        System.out.println("Работа потока " + Thread.currentThread().getName() + " началась");
        while (System.currentTimeMillis() < endTime) {
            logger.setDate(new Date());
            int resultLevel = random.nextInt(6);
            logger.setLevel(resultLevel);
            logger.setNameThread(Thread.currentThread().getName());
            logger.setMsg(resultLevel);
            logger.writeToConsole(logger.getDate(), logger.getLevel(), logger.getNameThread(), logger.getMsg());
            logger.writeToFile(logger.getDate(), logger.getLevel(), logger.getNameThread(), logger.getMsg());
            sleep();
        }
        System.out.println("Работа потока " + Thread.currentThread().getName() + " закончилась");

    }

    public static void sleep() {
        try {
            System.out.println("Поток " + Thread.currentThread().getName() + " засыпает");
            Thread.sleep(random.nextInt(5000));
            System.out.println("Поток " + Thread.currentThread().getName() + " просыпается");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}