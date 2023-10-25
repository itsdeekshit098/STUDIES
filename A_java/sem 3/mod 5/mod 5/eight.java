import javax.swing.*;
import java.awt.event.*;
public class eight 
{
    public static void main(String[] args) 
    {
        JFrame f4=new JFrame();
        f4.setSize(500, 500);
        f4.setVisible(true);
        f4.setLayout(null);
        
        JTextField f41=new JTextField();
        f41.setBounds(100, 100, 100, 50);
        f4.add(f41);

        JTextField f42=new JTextField();
        f42.setBounds(100, 150, 100, 50);
        f4.add(f42);

        JTextField f43=new JTextField();
        f43.setBounds(100, 200, 100, 50);
        f4.add(f43);
        JButton b4=new JButton();
        b4.setBounds(100, 250, 100, 50);
        f4.add(b4);

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int a=Integer.parseInt(f41.getText());
                int b=Integer.parseInt(f42.getText());
                int c=a+b;
                f43.setText(String.valueOf(c));
            }
        });

    }
}
