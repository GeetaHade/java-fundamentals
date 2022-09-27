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

class MarvellousListener implements WindowListener
{
  public void windowDeactivated(WindowEvent obj){}
  public void windowActivated(WindowEvent obj){}
  public void windowDeiconified(WindowEvent obj){}
  public void windowIconified(WindowEvent obj){}
  public void windowClosed(WindowEvent obj){}
  public void windowClosing(WindowEvent obj)
 {
   System.exit(0);
 }
  public void windowOpened(WindowEvent obj){}




}

class FrameDemo3
{
 public static void main(String arg[])
  {
    System.out.println("Print the data on console");  //cui

    MarvellousFrame mobj = new MarvellousFrame("PPA");
  
  }


}
//cntrl c deletes/kill main thread.