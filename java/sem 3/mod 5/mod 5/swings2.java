/*
 in extension to swings1 let us add
    1)some x label to display

 */
/*
 javax.swing.* is  the package path to access swings
 */
import javax.swing.*;

class swings2
{
    public static void main(String[] args) {
    //w.k.t we uses swing to work with gui so in gui the prompt u will see is the frame so we need to create the frae first so in order to create frame JFrame class is used
    JFrame x=new JFrame();
    x.setSize(500, 500);
    x.setLayout(null);//dont know why used as of now
    x.setVisible(true);//see if i didnt set the visibility to true if run program any prompt wont be displayed to you


    //creating a label
    JLabel y=new JLabel();//label is like a field where it will be like some space
    y.setBounds(250, 250, 100, 50);//x and y represent with respect to frame x and y axis,with and height represents the the width and height of that particular label
    //adding text into the label
    y.setText("hansi"); //see in setText everything should be in "" bcz taken as string(text)  even 123 also in ""
    x.add(y);//bcz the label we created need to pushed on tho the frame //should link the label with the frame
    

    //CREATING LABEL AND ADDING TEXT WHILE CREATING LABEL ITSELF

    JLabel y1=new JLabel("text passed while creating JLabel obj");//in output whole label wont be displayed bcz the width of the frame is not enough                                                                                        
    y1.setBounds(20, 30, 100, 50);
    x.add(y1);
   
    
    }
}
