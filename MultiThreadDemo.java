class MultiThreadDemo extends Thread {

    private String threadName;

    MultiThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        MultiThreadDemo t1 = new MultiThreadDemo("Thread 1");
        MultiThreadDemo t2 = new MultiThreadDemo("Thread 2");

        t1.start();
        t2.start();
    }
}