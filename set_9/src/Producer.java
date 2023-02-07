public class Producer implements Runnable{
    SharedBuffer myBuffer;

    Producer(SharedBuffer myBuffer){
        this.myBuffer = myBuffer;
    }

    @Override
    public void run() {
        this.consume();
    }

    void consume() {
        try{
            this.myBuffer.insert();
        }catch (InterruptedException ie){
            System.out.println("Interrupt Occurred");
        }catch (Exception e){
            System.out.println("Something Went Wrong!");
        }
    }
}
