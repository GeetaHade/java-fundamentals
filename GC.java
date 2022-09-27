import java.lang.*;

class Demo
{
  public int Arr[];
  
  public Demo(int size)
  {
   System.out.println("allocating the resources in constructor");
   this.Arr = new int[size];
  }

  protected void finalize()
  {
   System.out.println("deallocating resources in finalize");
   this.Arr = null;
  }
}

class GC
{
  public static void main(String arg[])
  {
   Demo dobj = new Demo(10);
   dobj = null; //yacha meaning obj cha vapar sampla..spoon ulte
   System.gc();

   System.out.println("end of main");
  }

}
