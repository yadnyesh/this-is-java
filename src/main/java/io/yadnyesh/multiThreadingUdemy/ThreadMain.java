package io.yadnyesh.multiThreadingUdemy;

import java.math.BigInteger;
import java.util.function.BiFunction;

public class ThreadMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        thread.interrupt();
    }

    public static class BlockingTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("Exiting Blocking Thread");
                throw new RuntimeException(e);
            }

        }
    }

    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {

        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) !=0 ; i = i.add(BigInteger.ONE)) {
                result = result.multiply(base);
            }
            return result;
        }
    }

}
