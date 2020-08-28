import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
     public class App extends JPanel {

        Grid grid;

        public App() {
            setPreferredSize(new Dimension(1000, 720));
            grid =  new Grid(); 
        }  
        
        
        @Override
        public void paint(Graphics g) {
            //System.out.println(getMousePosition());
            grid.paint(g , getMousePosition());
            repaint();
        }   

         
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        
    }
    
    public Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
        
    }
}