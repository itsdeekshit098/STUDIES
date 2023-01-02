import javax.swing.*;
public class tfield {
    public static void main(String[] args) 
    {
        JFrame f1=new JFrame();
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.setLayout(null);
        
        JTextField t1=new JTextField();
        t1.setBounds(100, 100, 100, 50);
        f1.add(t1);

        JLabel obj=new JLabel();
        obj.setText("hasni");
        obj.setBounds(1,1,100,50);
        f1.add(obj);

        JButton b1=new JButton("click on me");
        b1.setBounds(100, 150, 100, 50);
        f1.add(b1);
        
    }
}
