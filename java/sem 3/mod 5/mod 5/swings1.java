/*

    1)what is a swing 
    if we want to develop GUI related application then we will be using swing
 javax.swing.* is  the package path to access swings
/

 */
import javax.swing.*;

class swings1
{
    public static void main(String[] args) {
        //w.k.t we uses swing to work with gui so in gui the prompt u will see is the frame so we need to create the frae first so in order to create frame JFrame class is used
        JFrame x=new JFrame();

    x.setSize(500, 500);
    x.setLayout(null);//dont know why used as of now
    x.setVisible(true);//see if i didnt set the visibility to true if run program any prompt wont be displayed to you

    }
}