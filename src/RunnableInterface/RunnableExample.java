package RunnableInterface;

public class RunnableExample implements Runnable {

    private String name;
    
    public RunnableExample( String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for ( int i = 1; i <= 2; i ++) {
            System.out.println("Print index" + i +" from " + name  + "");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

    
}
