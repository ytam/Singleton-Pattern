import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Singleton extends JPanel implements ActionListener {

    JButton button;

    public Singleton(){
        setPreferredSize(new Dimension(200,200));
        JButton button= new JButton("Beni Tıkla");
        button.addActionListener(this);
        add(button);

    }

    public static void main (String []args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Singleton());
        frame.pack();
        frame.setLocation(700,350);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        new WithoutSingleton();

       // WithSingleton.getInstance();


    }
}
