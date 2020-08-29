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
        if(c==1){
            g.setColor(Color.DARK_GRAY);
        }else if(c==2){
            g.setColor(Color.BLUE);
        }else if (c==3){
            g.setColor(Color.GREEN);
        }
        else{
            g.setColor(new Color(j,j,0));
        }
        if (contains(mousePos)){          // delete next 3 lines to get rid of grey box where mouse is
            g.setColor(Color.GRAY);
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





/*abstract //Info Box
        if (contains(mousePos)){
            g.setColor(Color.GRAY);
            if( c==1){
                g.drawString("WALL", 750, 130);
                g.drawString("1000", 750, 180);
            }else if(c==2){
                g.drawString("OASIS", 750, 130);
                g.drawString("8", 750, 180);
            }else if (c==3){
                g.drawString("PALM TREE", 750, 130);
                g.drawString("2", 750, 180);
            } else{
                g.drawString("SAND", 750, 130);
                g.drawString("5", 750, 180);
            }
        } 
        */