import java.util.*;

class Exception2
{
 public static void main(String arg[])
{
  int ans=0, no2 =0, no1= 0;

  Scanner sobj = new Scanner(System.in);
  
  System.out.println("enter first number");
  no1 = sobj.nextInt();

  System.out.println("enter second number");
  no2 = sobj.nextInt();

  try
  {
   ans = no1/no2;  //exception prone code
  }

  catch(ArithmeticException obj)
  { 
   System.out.println("Exception occured as : "+obj);
  }
  System.out.println("Division is :"+ans);
  
  finally  
  {
  sobj.close(); //resource dealloction/ release 3d gogle
  }

}

}