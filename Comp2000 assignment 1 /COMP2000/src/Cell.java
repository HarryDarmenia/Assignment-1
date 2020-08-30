import java.awt.*;

class Cell extends Rectangle{
    static int size = 35;
    public static Object cell;
    
    int c = (int)(Math.random() * (10 - 1 + 1) + 1);
    int j =(int)(Math.random() * ((225 - 150) + 1) + 150);
    
    public Cell (int x, int y){
        super(x,y,size,size);
    }
    
    
    void paint(Graphics g, Point mousePos){
        if (contains(mousePos)){
            g.setColor(Color.GRAY);
        }else if(c==1){
            g.setColor(Color.DARK_GRAY);
        }else if(c==2){
            g.setColor(Color.BLUE);
        }else if (c==3){
            g.setColor(Color.GREEN);
        }
        else{
            g.setColor(new Color(j,j,0));
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);    
    }
    
    public boolean contains(Point p){
        if(p !=null){
            return super.contains(p);
        }else{
            return false;
        }
    }  
} 
