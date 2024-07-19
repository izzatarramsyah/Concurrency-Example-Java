package Thread;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        for ( int i = 1; i <= 2; i ++) {
            System.out.println("Print index" + i +" from " + this.getName() + "");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
    
}
