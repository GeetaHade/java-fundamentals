import java.util.*;

class Input
{
  public static void main(String a[])
{
   Scanner sobj = new Scanner(System.in);

   System.out.println("please enter your name");
   String name = sobj.nextLine();
   
   System.out.println("please enter your age");
   int Age = sobj.nextInt();
  
   System.out.println("enter your percentage");
   float percentage = sobj.nextFloat();

   System.out.println("name is: "+name);
   System.out.println("age is :"+Age);
   System.out.println("percentage : "+percentage);
   
   sobj.close();  //
}

}