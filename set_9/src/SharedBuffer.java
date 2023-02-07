import java.util.ArrayList;

public class SharedBuffer {
    ArrayList<Integer> buffer;
    private final int SIZE;

    public SharedBuffer(int size) {
        buffer=  new ArrayList<>(5);
        this.SIZE = size;
    }

    public void insert()throws InterruptedException{
        int item = 0;
        while(true) {
            synchronized (this) {
                // Wait if the list is Full
                if (buffer.size() == this.SIZE) {
                    wait();
                }

                System.out.println("Producer produced " + item);
                buffer.add(item++);

                notifyAll();

                Thread.sleep(1000);
            }
        }
    }

    public void remove() throws InterruptedException{
        int item = 0;
        while(true){
            synchronized (this){
                if(buffer.isEmpty()){
                    wait();
                }

                System.out.println("Consumer Consumed "+buffer.remove(0));

                notify();

                Thread.sleep(1000);
            }
        }
    }
}
