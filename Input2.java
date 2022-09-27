import java.lang.*;
import java.io.*; //4 accepting input



class Input2
{
  public static void main(String arg[])
  {
    InputStreamReader iobj = new InputStreamReader(System.in);  //here two obj act as resource
    BufferedReader bobj = new BufferedReader(iobj);

    try
    {
    
    System.out.println("Enter your name");
    String name = bobj.readLine();
 
    System.out.println("your name is:"+name);

    System.out.println("enter your age");
    int age = Integer.parseInt(bobj.readLine());
    System.out.println("your age is :"+age);
  }
  catch(IOException obj)
  {
    System.out.println("exception occurs");
  }
  finally
  {
   iobj = null;  //ithe key word ahe c c++ mdhe macro hota.
   bobj = null;
  }
  
  }
}