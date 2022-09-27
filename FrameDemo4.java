import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
 public Frame fobj;

 public MarvellousFrame(String name)
{
  fobj = new Frame(name);
  fobj.setSize(600,600);
  fobj.setVisible(true);  //he kadla tr frame create hote pn disat mhi so jvm la sang ki dakhav

  fobj.addWindowListener(new MarvellousListener());
}
}
//extends mnhje tumch vr javabdari nhi to write method u can overide ..inshort evdha pahije tevha ghe
class MarvellousListener extends WindowAdapter //implements WindowListener
{
 
  public void windowClosing(WindowEvent obj)
 {
   System.exit(0);
 }
  




}

class FrameDemo4
{
 public static void main(String arg[])
  {
    System.out.println("Print the data on console");  //cui

    MarvellousFrame mobj = new MarvellousFrame("PPA");
  
  }


}
//cntrl c deletes/kill main thread.