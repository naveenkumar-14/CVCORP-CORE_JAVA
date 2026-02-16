// This program creates a thread by implementing the Runnable interface and defining the run() method, which prints numbers from 0 to 9.

// In the main() method, a Thread object is created by passing the Program2 object to the Thread constructor, and calling start() begins execution of the new thread.

// The main thread prints characters from 'a' to 'y' while the new thread prints numbers simultaneously, showing concurrent execution using the Runnable interface.
public class Program2 implements Runnable{
    public void run(){
        try {
            Thread.currentThread().join();
        } catch (Exception e) {
        }
        
         System.out.println(Thread.currentThread().getName());
         
        for(int i=0;i<10;i++){
           
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Thread obj=new Thread(new Program2());
        obj.setName("Hello Thread");
        obj.setPriority(9);
        System.out.println(Thread.currentThread().getName());
         System.out.println("Thread priority: "+Thread.currentThread().getPriority());
        obj.start();
       
        
        
        for(char c='a';c<'z';c++){
            System.out.println(c);

        }
    }
}
