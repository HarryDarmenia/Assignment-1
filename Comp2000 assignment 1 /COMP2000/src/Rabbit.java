import java.awt.*;
import java.util.ArrayList;
public  class Rabbit extends Actor{
    ArrayList<Polygon> RABBIT= new ArrayList<Polygon>();
    
    public Rabbit(Cell location){
        Polygon ear1 = new Polygon();
        ear1.addPoint(location.x + 11, location.y + 5);
        ear1.addPoint(location.x + 11, location.y + 12);
        ear1.addPoint(location.x + 16, location.y + 12);
        ear1.addPoint(location.x + 16, location.y + 5);
        Polygon ear2 = new Polygon();
        ear1.addPoint(location.x + 19, location.y + 5);
        ear1.addPoint(location.x + 19, location.y + 12);
        ear1.addPoint(location.x + 24, location.y + 12);
        ear1.addPoint(location.x + 24, location.y + 5);
        Polygon face = new Polygon();
        face.addPoint(location.x+8, location.y + 12);
        face.addPoint(location.x+27, location.y + 12);
        face.addPoint(location.x+27, location.y + 25);
        face.addPoint(location.x+8, location.y + 25);

        RABBIT.add(ear1);
        RABBIT.add(ear2);
        RABBIT.add(face);
        
        this.list = RABBIT;
        this.loc = location;
    }
}