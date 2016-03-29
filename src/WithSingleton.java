import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * Created by brusk on 28.03.2016.
 */
public class WithSingleton extends JFrame {

    private static WithSingleton uniqueInstance;

    private static JPanel panel;
    private static JLabel label;
    private static String str="";

    private WithSingleton(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(200,200));
        pack();
        setLocation(750,150);
        java.util.Date now = new java.util.Date();
        str=now.toString();
        label= new JLabel(str);

        add(label);
        setVisible(true);

    }

    public static synchronized WithSingleton  getInstance(){
        if(uniqueInstance==null){
            uniqueInstance= new WithSingleton();
        }
        return  uniqueInstance;
    }

}