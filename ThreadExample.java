import javax.swing.text.DefaultStyledDocument;

//creating a thread by extending the threads class
//and overriding its run() method
public class ThreadExample extends Thread {         //we can not extend other class

    public static void main(String[] args) {
        ThreadExample t=new ThreadExample();       //object of thread   object==instance
        t.start();                                 //calling start() method
        System.out.println("This code is running outside the thread");
    }
    public void run(){
        System.out.println("This code is running inside the thread");
    }
}
