
import java.awt.*;
import java.util.Random;


class Grid{
    
    int count = 0;
    int countt =0;
    int CutOff =0;

    Random rand = new Random();

    Cell[][] cells = new Cell[20][20];
    Cell[] YellowCells = new Cell[0];
    
    public Grid(){ 
        
        for (int i = 0; i < cells.length; i ++) {
            for (int j = 0; j < cells[i].length; j ++) {
                cells[i][j]= new Cell(10+35*i, 10+35*j);
                if(cells[i][j].c > 3){
                    YellowCells = addToCellArray(YellowCells,cells[i][j],YellowCells.length);
                }
            }
        }
        
        CutOff = (int)(YellowCells.length* (80.0/100.0));

        for(int i=0; i<YellowCells.length;i++){
            for(int k=0; k<YellowCells.length; k++){
                if (YellowCells[i].j>YellowCells[k].j){
                    countt++;
                }
            }
            if (countt >CutOff){
                YellowCells[i].c =15;
            }else{
                YellowCells[i].c =13;
            }
            countt =0;
        }  
    }
    
    
    public Cell[] addToCellArray(Cell cells[], Cell cell, int x){
        Cell[] newYellowCells = new Cell[x+1];
        for (int i=0; i<x;i++){
            newYellowCells[i]=cells[i];
        }
        newYellowCells[x] =cell;  
        return newYellowCells;     
    }
    
    
    public String  cellType(Cell Cell) {
        if (Cell.c==1){
            return "WALL";
        }else if  (Cell.c==2){
            return "OASIS";
        }else if (Cell.c==3){
            return "PALM TREE";
        }
        return "";   
    }
    
    public String sandCellType(Cell Cell){
        if(Cell.c== 15){
            return "QUICK SAND";
        }else if(Cell.c ==13){
            return "SAND";
        }
        return"";
    }
    
    
    public String  travelTime(Cell Cell) {
        if (Cell.c==1){
            return "1000";
        }else if  (Cell.c==2){
            return "8";
        }else if (Cell.c==3){
            return "2";
        }
        return "";
    }
    public String  sandTravelTime(Cell Cell) {
        if (Cell.c == 15){
            return "15";
        } else if(Cell.c == 13){
            return "5";
        }
        return "";
    }
    
    
    
    public void paint(Graphics g, Point mousePos){
        for (int i = 0; i < cells.length; i ++) {
            for (int j = 0; j < cells[i].length; j ++) {
                cells[i][j].paint(g, mousePos); 
                
                if(cells[i][j].contains(mousePos)){
                    g.setColor(Color.GRAY);
                    g.drawString(cellType(cells[i][j]), 750, 130);
                    g.drawString(travelTime(cells[i][j]), 750, 180);   
                }
            }
            
        }

        for(int i=0; i<YellowCells.length;i++){
            if(YellowCells[i].contains(mousePos)){
                g.setColor(Color.GRAY);
                g.drawString(sandCellType(YellowCells[i]), 750, 130);
                g.drawString(sandTravelTime(YellowCells[i]), 750, 180);
            }
        }
        
        g.drawRect(740,80,230, 140);
        g.setColor(Color.BLACK);
        g.drawString("Type of cell:", 750, 110);
        g.drawString("The crossing time of that cell:",750, 160);
    }    
}


