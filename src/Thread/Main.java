package Thread;

public class Main {
    
    public static void main(String[] args) {
        ThreadExample threadOne = new ThreadExample();
        ThreadExample threadTwo = new ThreadExample();

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();

    }
    
}
