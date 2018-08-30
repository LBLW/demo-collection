package base.demo.thread;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;

/**
 * @author wangzezhou
 * @create 2018-08-07 下午2:42
 * @desc 线程池计算
 * black magic
 **/
public abstract class PoolSizeCalculator {

    private final int SIMPLE_QUEUE_SIZE = 1000;
    private final int EPSYLON = 20;
    private volatile boolean expired;
    private final long testTime = 3000;

    protected void calculateBoundaries(BigDecimal targetUtilization, BigDecimal targetQueueSizeBytes) {
        calculateOptimalCapacity(targetQueueSizeBytes);
        Runnable task = createTask();
        start(task);
        start(task);
        long cpuTime = getCurrentThreadCPUTime();
        start(task);
        cpuTime = getCurrentThreadCPUTime() - cpuTime;
        long waitTime = (testTime * 1000000) - cpuTime;
        calculateOptimalThreadCount(cpuTime, waitTime, targetUtilization);
    }

    private void calculateOptimalCapacity(BigDecimal targetQueueSizeBytes) {

        long mem = calcuateMemoryUsage();
        BigDecimal queueCapacity = targetQueueSizeBytes.divide(new BigDecimal(mem), RoundingMode.HALF_UP);
        System.out.println("Target queue memory usage (bytes): " + targetQueueSizeBytes);
        System.out.println("createTask() produced " + createTask().getClass().getName() + " which took " + mem               + " bytes in a queue");
        System.out.println("Formula: " + targetQueueSizeBytes + " / " + mem);
        System.out.println("* Recommended queue capacity (bytes): " + queueCapacity);
    }

    private void calculateOptimalThreadCount(long cpu, long wait, BigDecimal targetUtilization) {

        BigDecimal waitTime = new BigDecimal(wait);
        BigDecimal computeTime = new BigDecimal(cpu);
        BigDecimal numberOfCpu = new BigDecimal(Runtime.getRuntime().availableProcessors());
        BigDecimal optimalThreadCount = numberOfCpu.multiply(targetUtilization)
                .multiply(new BigDecimal(1).add(waitTime.divide(computeTime, RoundingMode.HALF_UP)));

        System.out.println("Number of CPU: " + numberOfCpu);
        System.out.println("Target utilization: " + targetUtilization);
        System.out.println("Elapsed time (nanos): " + (testTime * 1000000));
        System.out.println("Compute time (nanos): " + cpu);
        System.out.println("Wait time (nanos): " + wait);
        System.out.println("Formula: " + numberOfCpu + " * "
                + targetUtilization + " * (1 + " + waitTime + " / " + computeTime + ")");
        System.out.println("* Optimal thread count: " + optimalThreadCount);

    }

    private void collectGarbage(int times){

        for(int i=0; i<times; i++){
            System.gc();
            try {
                Thread.sleep(10);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public long calcuateMemoryUsage() {
        BlockingQueue queue = createWorkQueue();
        for(int i=0; i<SIMPLE_QUEUE_SIZE; i++) {
            queue.add(createTask());
        }

        long mem0 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long mem1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        queue = null;

        collectGarbage(15);

        mem0 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        queue = createWorkQueue();

        for(int i=0; i<SIMPLE_QUEUE_SIZE; i++) {
            queue.add(createTask());
        }

        collectGarbage(15);

        mem1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        return (mem1 - mem0) / SIMPLE_QUEUE_SIZE;
    }

    public void start(Runnable task) {
        long start = 0;
        long runs = 0;

        do{
            if(++runs > 5) {
                throw new IllegalStateException("Test not accurate");
            }

            expired = false;

            start = System.currentTimeMillis();

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    expired = true;
                }
            }, testTime);

            while(!expired) {
                task.run();
            }

            start = System.currentTimeMillis() - start;

        } while (Math.abs(start - testTime) > EPSYLON);
        collectGarbage(3);

    }

    protected abstract Runnable createTask();

    protected abstract BlockingQueue createWorkQueue();

    protected abstract long getCurrentThreadCPUTime();
}
