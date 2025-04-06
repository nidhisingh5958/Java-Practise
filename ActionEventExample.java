// file: applet.java
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code ='ActionEventExample' width=200 height=200>
 * </applet>
 */


public class ActionEventExample extends Applet implements ActionListener {
    String actionmessage = "";
    public void init(){
        Button b1 = new Button("OK");
        Button b2 = new Button("Submit");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(actionmessage, 20, 50);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if (action.equals("OK")){
            actionmessage = "OK button clicked";
        } else if (action.equals("Submit")){
            actionmessage = "Submit button clicked";
        }
        repaint();
    }
    
}
