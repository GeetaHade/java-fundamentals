//wraper class : bahercha wrapper Integer ughadla ki at int

import java.lang.*;

//template <class T> 
class Arithmatic<T>
{
  public T Addition(T No1, T No2)
  {
   
   
   if((No1 instanceof Integer) && (No2 instanceof Integer))
   {
     return (T)((Integer)No1 + (Integer)No2);
   }
   else if((No1 instanceof Float) && (No2 instanceof Float))
   {
     return (T)((Float)No1 + (Float)No2);
   }
   
    else if((No1 instanceof Double) && (No2 instanceof Double))
   {
    return (T)((Double)No1 + (Double)No2);
   }
   else
   {
     return null;
   }
    
  }
}

class Genric
{
 public static void main(String arg[])
 {
  Arithmatic <Integer>obj = new Arithmatic<Integer>();
  Integer ret = 0;
  ret= obj.Addition(10,11);
  System.out.println("Addition is :"+ret);
 
 Arithmatic <Float>obj2 = new Arithmatic<Float>();
 Float ret2 = 0.0f;
  ret2= obj2.Addition(10.8f,11.4f);
  System.out.println("Addition is :"+ret2);
 
 }

}