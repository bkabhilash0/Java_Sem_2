public class S8_Pro_004 {
    public static void main(String[] args) {
        SharedBuffer sb = new SharedBuffer(5);
        Producer pr = new Producer(sb);
        Consumer cs = new Consumer(sb);

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(cs);

        t1.start();
        t2.start();
    }
}
