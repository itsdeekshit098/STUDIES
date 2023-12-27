
import javax.swing.*;
import java.awt.event.*;
public class sixth
{
public static void main(String[] args) 
{
    JFrame f3=new JFrame();
    f3.setSize(500, 500);
    f3.setVisible(true);
    f3.setLayout(null);

    JButton b3=new JButton();
    b3.setText("PRESS ME");
    b3.setBounds(100,100,100,50);
    f3.add(b3);

    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            b3.setText("PRESSED");
        }
    });
}    
}
