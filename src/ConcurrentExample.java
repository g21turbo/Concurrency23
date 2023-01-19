public class ConcurrentExample {

    public static void main(String[] args) {

        // First task to run concurrently
        Runnable task1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 1: " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Second task to run concurrently
        Runnable task2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 2: " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Task 3: " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create two threads, one for each task
        // and start them to run concurrently
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
    }
}
