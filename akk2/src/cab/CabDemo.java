package cab;

 

class Waiter
{ 
    String token;
    public Waiter(String token)
    {
        this.token=token;
    }
}

 

class waiterRunner implements Runnable
{
    Waiter w;
    public waiterRunner(Waiter w)
    {
        this.w=w;
    }

    public void run()
    {
        synchronized(w)
        {
            System.out.println("waiter run "+w.token);
             try{
                 //cab.wait(3000);
                 w.wait(2000);
             }
             catch(InterruptedException e)
             {
                 System.out.println(e);
             }

        }
    }

}

 

class waiterNotifier implements Runnable
{
    Waiter w;
    public waiterNotifier(Waiter w)
    {
        this.w=w;
    }
    public void run()
    {
        synchronized(w)
        {
            try{
                //cab.notifyAll();
             w.notify();
                System.out.println("notified ");
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    }
}
public class CabDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
   Waiter w=new Waiter("wait");
   waiterRunner runner=new waiterRunner(w);
   waiterRunner runner1=new waiterRunner(w);
   waiterNotifier notifier=new waiterNotifier(w);
   Thread t1=new Thread(runner);
   Thread t3=new Thread(runner1);
   Thread t2=new Thread(notifier);
   t1.start();
   t3.start();
    try{
        Thread.sleep(3000);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
   t2.start();
    }

 

}
