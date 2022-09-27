import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter implements ActionListener
{
 public Frame fobj;
 public Button bobj;
 public TextField tobj;

 public MarvellousFrame(String name)
{
  fobj = new Frame(name);
  bobj = new Button("Marvellous");
  tobj = new TextField();

  tobj.setBounds(60,60,170,20);
  bobj.setBounds(110,130,90,20);

  fobj.add(bobj);
  fobj.add(tobj);


  fobj.setSize(600,600);
  fobj.setVisible(true);  //he kadla tr frame create hote pn disat mhi so jvm la sang ki dakhav
  fobj.setLayout(null);  

  bobj.addActionListener(this);
  fobj.addWindowListener(this);

}

public void windowClosing(WindowEvent obj)
 {
   System.exit(0);
 }

 public void actionPerformed(ActionEvent obj)
 {
  // System.out.println("Button clicked");
   tobj.setText("Jay ganesh...");
 }

}

class FrameDemo5
{
 public static void main(String arg[])
  {
    System.out.println("Print the data on console");  //cui

    MarvellousFrame mobj = new MarvellousFrame("PPA");
  
  }


}
//cntrl c deletes/kill main thread.