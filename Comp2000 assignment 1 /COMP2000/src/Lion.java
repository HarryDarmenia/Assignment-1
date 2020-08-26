import java.awt.*;
import java.util.ArrayList;
public  class Lion  extends Actor{
    ArrayList<Polygon> LION= new ArrayList<Polygon>();
    
    public Lion(Cell location){
        this.loc = location;
        Polygon mane = new Polygon();
        mane.addPoint(location.x + 6, location.y + 6);
        mane.addPoint(location.x + 29, location.y + 6);
        mane.addPoint(location.x + 29, location.y + 29);
        mane.addPoint(location.x + 6, location.y + 29);
        Polygon face = new Polygon();
        face.addPoint(location.x + 11, location.y + 11);
        face.addPoint(location.x + 24, location.y + 11);
        face.addPoint(location.x + 24, location.y + 24);
        face.addPoint(location.x + 11, location.y + 24);
        
        LION.add(mane);
        LION.add(face);

        this.list=LION;
    }
}