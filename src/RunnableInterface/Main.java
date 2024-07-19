package RunnableInterface;

public class Main {
    
    public static void main(String[] args) {

        Thread threadOne = new Thread(new RunnableExample("First thread"));
        Thread threadTwo = new Thread(new RunnableExample("Second thread"));

        threadOne.start();
        threadTwo.start();
    }

}
