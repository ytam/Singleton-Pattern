import javax.swing.*;
import java.awt.*;

/**
 * Created by brusk on 28.03.2016.
 */

public class WithoutSingleton extends JFrame{

    private static JPanel panel;
    private static JLabel label;
    private static String str="";

    public WithoutSingleton(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(200,100));
        pack();
        setLocation(750,250);
        java.util.Date now = new java.util.Date();
        str=now.toString();
        label= new JLabel(str);
        add(label);
        setVisible(true);

    }

}
