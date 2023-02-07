// Write a program to implement threads by implementing the Runnable interface.

public class S8_Pro_002 implements Runnable {
    int n;

    S8_Pro_002(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Looping...." + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Something went Wrong.." + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        S8_Pro_002 s1 = new S8_Pro_002(10);
        S8_Pro_002 s2 = new S8_Pro_002(15);

        new Thread(s1).start();
        new Thread(s2).start();
    }
}
