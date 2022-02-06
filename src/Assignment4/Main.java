package Assignment4;

public class Main {
    public static void main(String[] args) {
        Runnable thread1=new PrimeNumber(0,250000);
        Thread t1=new Thread(thread1);

        Runnable thread2=new PrimeNumber(250001,300000);
        Thread t2=new Thread(thread2);

        Runnable thread3=new PrimeNumber(300001,500000);
        Thread t3=new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();


    }
}