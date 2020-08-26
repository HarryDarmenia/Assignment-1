import java.awt.*;
import java.util.*;

public class Stage{
    
    Grid grid;
     ArrayList<Actor> actors = new ArrayList<Actor>();
     Actor puppy;
     Actor lion;
     Actor rabbit;


    public Stage(){
       
        grid = new Grid();

        puppy = new Puppy(grid.cellAtColRow(0,0));
        lion = new Lion(grid.cellAtColRow(0,18));
        rabbit = new Rabbit(grid.cellAtColRow(14,3));

        actors.add(puppy);
        actors.add(lion);
        actors.add(rabbit); 
    }



    public void paint (Graphics g,Point mouseLoc){
        grid.paint(g, mouseLoc);
        for (int i=0; i<actors.size(); i++){
            actors.get(i).paint(g);
        }
    }
}

