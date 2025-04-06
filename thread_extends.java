// Java program to demonstrate the use of thread priority
// and how it affects the execution order of threads

// Thread using extends

class A extends Thread{
    public void run(){   
    for (int i=0; i<10; i++){
        System.out.println("Thread 1 is running");
        try{
        Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Thread 1 interrupted");
        }

    }}
}
class B extends Thread{
    public void run(){   
    for (int i=0; i<10; i++){
        System.out.println("Thread 2 is running");
        try{
        Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Thread 2 interrupted");
        }

    }}
} 
public class thread_extends {
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
     
            obj1.start();
            obj2.start();
        
    } 
}
