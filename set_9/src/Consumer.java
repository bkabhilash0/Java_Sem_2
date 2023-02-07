public class Consumer implements Runnable{
    SharedBuffer myBuffer;

    Consumer(SharedBuffer myBuffer){
        this.myBuffer = myBuffer;
    }

    @Override
    public void run() {
        this.consume();
    }

    void consume() {
        try{
            this.myBuffer.remove();
        }catch (InterruptedException ie){
            System.out.println("Interrupt Occurred");
        }catch (Exception e){
            System.out.println("Something Went Wrong!");
        }
    }
}
