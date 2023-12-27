import javax.swing.*;
import java.awt.event.*;
public class fifth 
{
    public static void main(String[] args) 
    {
        JFrame f2=new JFrame();
        f2.setSize(500,500);
        f2.setVisible(true);
        f2.setLayout(null);

        //JLAbel(text)
        JLabel l2=new JLabel();//JLabel l2=new JLabel("hansi");
        l2.setBounds(1, 1, 100, 50);
        l2.setText("hasni");
        f2.add(l2);

        //JTextField
        JTextField tf2=new JTextField();
        tf2.setBounds(100, 150, 100, 50);
        f2.add(tf2);
        //JButton
        JButton b2=new JButton("click on me");
        b2.setBounds(100, 100, 100,50 );
        f2.add(b2);

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            tf2.setText("Listner in Action..");
            }
        });
    
    
    
        
    }
}
