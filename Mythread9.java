import java.lang.*;

class Marvellous extends Thread
{
public void run()
{
 System.out.println("Inside thread:"+Thread.currentThread().getName());
  System.out.println("thread priority is :"+Thread.currentThread().getPriority());
}

}

