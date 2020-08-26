import java.awt.*;
import java.util.ArrayList;

public class Actor {
    Color color;
    Cell loc;
    ArrayList<Polygon> list;
    
    public void paint(Graphics g){
        g.setColor(color);
        for (int i=0; i<list.size(); i++){
            g.drawPolygon(list.get(i));
        }
    }
    
    
}




