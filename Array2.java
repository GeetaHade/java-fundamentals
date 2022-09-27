import java.lang.*;
import java.util.*;
 
class Array2
{
 public static void main(String arg[])
{
 int icnt =0;
 Scanner sobj = new Scanner(System.in);//conectv to keyboaard
  System.out.println("enter no of elements");
  int size = sobj.nextInt();

  int Arr[] = new int[size];

  System.out.println("enter number of elements");
  for(icnt = 0; icnt < Arr.length; icnt++)
  {
    Arr[icnt] = sobj.nextInt();
  }
  System.out.println("number of elements are");
  for(icnt = 0; icnt < Arr.length; icnt++)
  {
  System.out.println(Arr[icnt]);
  }
   
}

}