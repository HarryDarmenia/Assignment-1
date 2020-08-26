import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public class App extends JPanel {
        
        Stage stage;
        
        public App() {
            setPreferredSize(new Dimension(720, 720));
            stage =  new Stage(); 
        }  
        
        
        @Override
        public void paint(Graphics g) {
            stage.paint(g , getMousePosition());
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

