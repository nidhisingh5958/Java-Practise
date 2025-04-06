class A implements Runnable{
    public void run() {
        System.out.println("Thread 1 is running");
        try{
            Thread.sleep(5);}
            catch(InterruptedException e){
                System.out.println(e);
            }
    }
}
class B implements Runnable{
    public void run() {
        System.out.println("Thread 2 is running");
        try{
            Thread.sleep(5);}
            catch(InterruptedException e){
                System.out.println(e);
            }
    }
}
public class thread_implements {
    public static void main(String args[]){
    Runnable obj1 = new A();
    Runnable obj2 = new B();

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start(); 
    t2.start();
    }
}
