import java.lang.*;

class Demo extends Thread
{
 public void run()  //running callback method abtract
{
  for(int i =0; i< 10; i++)
  {
    System.out.println("value of i :"+i);
    try        //checked exeption
    {
      Thread.sleep(1000);  //1 sec
    }
    catch(Exception obj)
    {}
  }
}
}

class Mythread6
{
  public static void main(String ar[])throws Exception
  {
    Demo obj1 = new Demo();
    Thread t1 = new Thread(obj1,"first");  //new state

    Demo obj2 = new Demo();
    Thread t2 = new Thread(obj2,"second"); 
    
    t1.start();  //Runnable state
    t1.join();  //ithe yeun code adakto t1 dead zlyavr pudhe jato
    t2.start();
  }
}

//zoom meeting example..new..join meet  runable..waiting room  admin...sheduler...meeting chalu running state.break ..sleep..meet end dead state