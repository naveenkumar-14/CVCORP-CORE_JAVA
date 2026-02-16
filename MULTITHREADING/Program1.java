//This program creates a new thread by extending the Thread class and overriding the run() method, which prints numbers from 0 to 9.

//In the main() method, the start() method is called on the thread object, which starts a separate thread and executes the run() method concurrently.

//While the new thread prints numbers, the main thread simultaneously prints characters from 'a' to 'y', demonstrating multithreading and concurrent execution.
public class Program1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Program1 obj=new Program1();
        obj.start();
        for(char c='a';c<'z';c++){
            System.out.println(c);
        }
    }
}
