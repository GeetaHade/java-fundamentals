import java.lang.*;

class Mythread1
{
public static void main(String arg[])
{
  System.out.print("Inside main");

  Thread tobj = Thread.currentThread();

  System.out.println("Name of current thread is :"+tobj.getname());

}
}