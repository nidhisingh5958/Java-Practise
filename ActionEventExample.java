// file: applet.java
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code ='ActionEventExample' width=200 height=200>
 * </applet>
 */


public class ActionEventExample extends Applet implements ActionListener {
    String actionMessage = "";
    public void init(){
        Button b1 = new Button("OK");
        Button b2 = new Button("Submit");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g){
        g.drawString(actionMessage, 20, 50);
    }
    public void actionPerformed(ActionEvent ae){
        String action = ae.getActionCommand();
        if (action.equals("OK")){
            actionMessage = "OK button clicked";
        } else if (action.equals("Submit")){
            actionMessage = "Submit button clicked";
        }
        repaint();
    }
    
}
