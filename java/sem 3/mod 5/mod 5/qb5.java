import javax.swing.*;
class qb5 
{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500, 500);//note width and then height\
        frame.setVisible(true);

        //JLabel
        JLabel label=new JLabel();
        label.setBounds(100, 100, 100, 500);
        label.setText("label text");
        frame.add(label);

        //JTextField
        JTextField tfield=new JTextField();
        tfield.setBounds(1, 6, 100, 50);
        frame.add(tfield);
    }
    
}

